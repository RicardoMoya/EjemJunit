package Main;
public class NumComplejo {
	
	private double pReal;
	private double pImaginaria;
	
	
	public NumComplejo(){
		
	}
	
	public NumComplejo(double pReal, double pImaginaria){
		this.pReal=pReal;
		this.pImaginaria=pImaginaria;
	}
	
	public double getpReal() {
		return pReal;
	}
	
	public void setpReal(double pReal) {
		this.pReal = pReal;
	}
	
	public double getpImaginaria() {
		return pImaginaria;
	}
	
	public void setpImaginaria(double pImaginaria) {
		this.pImaginaria = pImaginaria;
	}
	
	/**
	 * Suma dos numeros complejos
	 * @param c1
	 * @param c2
	 * @return suma
	 */
	public NumComplejo sumarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();
		
		result.setpReal(c1.getpReal()+c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria()+c2.getpImaginaria());
		
		return result;
	}
	
	/**
	 * Resta dos numeros complejos
	 * @param c1
	 * @param c2
	 * @return resta
	 */
	public NumComplejo restarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();
		
		result.setpReal(c1.getpReal()-c2.getpReal());
		result.setpImaginaria(c1.getpImaginaria()-c2.getpImaginaria());
		
		return result;
	}
	
	/**
	 * Multiplica dos numeros complejos
	 * @param c1
	 * @param c2
	 * @return multiplicacion
	 */
	public NumComplejo multiplicarComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();
		
		double a=c1.getpReal();
		double b=c1.getpImaginaria();
		double c=c2.getpReal();
		double d=c2.getpImaginaria();
		
		result.setpReal((a*c)-(b*d));
		result.setpImaginaria((a*d)+(b*c));
		
		return result;
	}
	
	/**
	 * Divide dos numeros complejos
	 * @param c1
	 * @param c2
	 * @return division
	 */
	public NumComplejo dividirComplejos (NumComplejo c1, NumComplejo c2){
		NumComplejo result = new NumComplejo();
		
		double a=c1.getpReal();
		double b=c1.getpImaginaria();
		double c=c2.getpReal();
		double d=c2.getpImaginaria();
		
		double dividendoReal = (a*c)+(b*d);
		double dividendoImaginario = (b*c)-(a*d);
		double divisor = (Math.pow(c, 2)+Math.pow(d, 2));
		
		result.setpReal(dividendoReal/divisor);
		result.setpImaginaria(dividendoImaginario/divisor);
		
		return result;
	}
	
	/**
	 * Calcula el modulo de un numero complejo
	 * @param numComplejo
	 * @return modulo
	 */
	public double modulo (NumComplejo numComplejo){
		double real =  numComplejo.getpReal();
		double imaginaria = numComplejo.getpImaginaria();
		
		return Math.sqrt(Math.pow(real, 2)+Math.pow(imaginaria, 2));
	}
	
	@Override
	public String toString(){
		if (pImaginaria>=0){
			return pReal+"+"+pImaginaria+"i";
		}else
			return pReal+"-"+(pImaginaria*(-1))+"i";
	}
	
	/**********************************************************************/
	/****** Métodos absurdos para poder mostrar un ejemplo con Junit ******/
	/**********************************************************************/
	// Método que te devuelve true si el numero que se le pasa es positivo
	// o false si es negativo
	public boolean esPositivo(double num){
		if(num>0)
			return true;
			else
				return false;
	}
	
	
	/**
	 * Método Absurso que devuelve un array
	 * @param c1
	 * @return
	 */
	public double [] getUnArray (NumComplejo c1){
		double [] nums = new double [2];
		nums[0]=c1.getpReal();
		nums[1]=c1.getpImaginaria();
		return nums;
	}
	
	/**
	 * OTRO Método Absurso que devuelve un array de tamaño 2 sumando 1 al primer elemento
	 * @param c1
	 * @return
	 */
	public double [] getOtroArray (double [] array){
		array[0] ++;
		return array;
	}
	
	
	/**
	 * Método absurdo que tarda 2 segundos en dar el resultado
	 * @return
	 * @throws InterruptedException
	 */
	public int time () throws InterruptedException{
		Thread.sleep(4000);
		return 1;
	}
	
}
