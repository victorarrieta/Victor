package models;

@Entity
@Table(name = "empleados")
public class Empleado {

	 @Id
	 @Column(name ="idEmpleados")
	 private int idEmpleados;
	
	 @Column(name ="apellidos")
     	private  String apellidos;

	 @Column(name ="nombres")
	  private String nombres;
	
	  @Column(name ="edad")
	  private int edad;
	
	 @Column(name ="sexo")
	  private String sexo;
	 
	 @Column(name ="salario")
	  private double salario;
	
	
	  public Empleado() {
	
	}

	public Empleado(String apellidos, String nombres, int edad, String sexo, double salario) {
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}

	public int getIdEmpleado() {
		return idEmpleados;
	}
	
	public void setIdEmpleado(int idEmpleados) {
		this.idEmpleados= idEmpleados;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getNombres() {
		return nombres;
	}
	
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	@Override
	public String toString() {
		return "Empleado [idEmpleados=" + idEmpleados + ", apellidos=" + apellidos + ", nombres=" + nombres + ", edad="
				+ edad + ", sexo=" + sexo + ", salario=" + salario + "]";
	}
	
	
	
}
	