package controllers;


import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

import models.Empleado;


public class UsuarioController {

	
	public String createEmpleado(String apellido, String nombre, int edad, String sexo, int salario) {
	
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
	
		Session session;
		session = sessionFactory.openSession();
		
		try {
			Empleado empleado;
			empleado= new Empleado(apellido, nombre, edad, sexo, salario);
		
			session.beginTransaction();
			session.save(empleado);
			session.getTransaction().commit();
		
			sessionFactory.close();
			
			return "Se ha creado correctamente";
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		return "Creacion incorrecta,revise lo datos";
		
	}
	
	
	public String deleteEmpleado(int idempleado) {
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
	
		Session session;
		session = sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			Empleado empleado= session.get(Empleado.class, idempleado);
			session.delete(empleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return "Usuario Eliminado";
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		return "A ocurrido un erorr inesperado";
	}
	
	// Actualizar o modificar Empleado
		public String updateEmpleado(int idempleado, String nombre) {
				
			SessionFactory sessionFactory;
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
			
			Session session;
			session= ((Object) sessionFactory).openSession();
			
			try {
				
				((Object) session).beginTransaction();
				Empleado empleado = session.get(Empleado.class, idempleado);
				empleado.setNombre(nombre);
				session.update(empleado);
				session.getTransaction().commit();
				
				sessionFactory.close();
				
				return "actualizado correctamente";
			}
			
			catch (Exception e) {
				
				e.printStackTrace();
				
			}
			
			return "Error al actualizar usuario";
			
			}
		
		public String getEmpleado(int idempleado) {
			
			SessionFactory sessionFactory;
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
			
			Session session;
			session= sessionFactory.openSession();
			
			try {
			
				session.beginTransaction();
				Empleado empleado = session.get(Empleado.class, idempleado);
				session.getTransaction().commit();
				sessionFactory.close();
				
				return empleado.toString();
			}
			
			catch(Exception e){
				
				e.printStackTrace();
			}
			
			return "no exites los datos";
			
		}
}

