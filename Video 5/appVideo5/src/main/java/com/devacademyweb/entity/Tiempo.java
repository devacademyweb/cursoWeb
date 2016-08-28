package com.devacademyweb.entity;

public class Tiempo {
	private int hora;//0-23
	private int minuto;//0-59
	private int segundo;//0-59
	
	public Tiempo() {
		this(0,0,0);//invoca al constructor Tiempo con 3 argumentos
	}
	
	public Tiempo(int h){
		this(h,0,0);
	}
	
	public Tiempo(int h,int m){
		this(h,m,0);
	}
	
	public Tiempo(int h,int m, int s){
		establecerTiempo(h,m,s);
	}
	
	public Tiempo(Tiempo tiempo){
		this(tiempo.getHora(),tiempo.getMinuto(),tiempo.segundo);
	}

	public void establecerTiempo(int h,int m,int s){
		setHora(h);
		setMinuto(m);
		setSegundo(s);
	}
	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if(hora>=0 && hora<24)			
			this.hora = hora;
		else
			throw new IllegalArgumentException("Hora debe ser de 0 a 23 ");
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if(minuto>=0 && minuto<60)			
			this.minuto = minuto;
		else
			throw new IllegalArgumentException("Minuto debe ser de 0 a 59 ");
		
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if(segundo>=0 && segundo<60)			
			this.segundo = segundo;
		else
			throw new IllegalArgumentException("Segundo debe ser de 0 a 59 ");
	}
	
	//Convierte a String en formato de hora universal(HH:MM:SS)
	public String aStringUniversal(){
		return String.format("%02d:%02d:%02d",this.getHora(),this.getMinuto(),this.getSegundo());
	}
	
	//Convierte a String en formato de hora estandar( HH:MM:SS AM o PM)
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  String.format("%02d:%02d:%02d %s",
				((this.getHora()==0 || this.getHora()==12)? 12:this.getHora()%12),
				this.getMinuto(),this.getSegundo(),(this.getHora()<12 ? "AM":"PM"));
	}
	
	
}
