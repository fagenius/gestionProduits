package gestion.produit.controleur;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import gestion.produit.dao.IProduitDao;
import gestion.produit.dao.ProduitDaoImpl;
import gestion.produit.domaine.Produit;

@WebServlet(name="cs", urlPatterns = {"*.isi"})
public class ControleurServlet extends HttpServlet{
	private IProduitDao metier;
	
	@Override
	public void init() throws ServletException {
		metier = new ProduitDaoImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		if(path.equals("/index.isi")) {
			request.getRequestDispatcher("produit.jsp").forward(request, response);
		}
		if(path.equals("/chercher.isi")) {
			String motCle = request.getParameter("motCle");
			ProduitModel model = new ProduitModel();
			model.setMotCle(motCle);
			List<Produit> produits = metier.produitsParMC("%"+motCle+"%");
			model.setProduits(produits);
			request.setAttribute("model", model);
			request.getRequestDispatcher("produit.jsp").forward(request, response);
		}else if(path.equals("/saisie.isi")){
			request.getRequestDispatcher("saisieProduit.jsp").forward(request, response);
		}else {
			response.sendError(Response.SC_NOT_FOUND);
		}
		
	}
}
