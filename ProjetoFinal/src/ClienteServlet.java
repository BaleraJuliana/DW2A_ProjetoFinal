import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/main")
public class ClienteServlet extends HttpServlet{
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
		String nome = request.getParameter("nome");
		String rg = request.getParameter("rg");
		String cpf = request.getParameter("cpf");
		
		System.out.println(nome);
		System.out.println(rg);
		System.out.println(cpf);
		
		
		adicionaCliente("0", 0, nome, "1");
		buscarCliente(0);
		


	}

	public void adicionaCliente(String cpf, int id, String nome, String rg){
		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		cliente.setId(id);
		cliente.setNome(nome);
		cliente.setRg(rg);
		ClienteJpaDAO.getInstance().merge(cliente);
		System.out.println("Salvo com sucesso !");
	}
	
	public void removeCliente(int id){
		 ClienteJpaDAO.getInstance().removeById(id);
		 System.out.println("Removido com sucesso!");
	}
	
	public static void buscarCliente(int id){
		
		Cliente cliente = ClienteJpaDAO.getInstance().getById(id);
	    System.out.println(cliente.getCpf());
	    System.out.println(cliente.getId());
	    System.out.println(cliente.getNome());
	    System.out.println(cliente.getRg());
		
	}
	
	
}	

