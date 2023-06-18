public class Exemplar {

	//Construtor
	public Exemplar( boolean novoEmprestado, boolean novoPerdido, int novoDiasEmprestado, int novoDiasReservado, boolean novoEstaAtrasado, boolean novoEstaReservado) {
		setEmprestado(novoEmprestado);
		setPerdido(novoPerdido);
		setDiasEmprestado(novoDiasEmprestado);
		setEstaAtrasado(novoDiasReservado);
		setEstaReservado(novoEstaAtrasado);
		setExemplares(novoEstaReservado);
	}

	protected boolean emprestado;
	protected boolean perdido;
	protected int diasEmprestado;
	protected int diasReservado;
	protected boolean estaAtrasado;
	protected boolean estaReservado;

	private Main(boolean emprestado, boolean perdido, int diasEmprestado, int diasReservado,
				 boolean estaAtrasado, boolean estaReservado) {
		this.emprestado = emprestado;
		this.perdido = perdido;
		this.diasEmprestado = diasEmprestado;
		this.diasReservado = diasReservado;
		this.estaAtrasado = estaAtrasado;
		this.estaReservado = estaReservado;
	}

	public static class Builder {
		private boolean emprestado;
		private boolean perdido;
		private int diasEmprestado;
		private int diasReservado;
		private boolean estaAtrasado;
		private boolean estaReservado;

		public Builder setEmprestado(boolean emprestado) {
			this.emprestado = emprestado;
			return this;
		}

		public Builder setPerdido(boolean perdido) {
			this.perdido = perdido;
			return this;
		}

		public Builder setDiasEmprestado(int diasEmprestado) {
			this.diasEmprestado = diasEmprestado;
			return this;
		}

		public Builder setDiasReservado(int diasReservado) {
			this.diasReservado = diasReservado;
			return this;
		}

		public Builder setEstaAtrasado(boolean estaAtrasado) {
			this.estaAtrasado = estaAtrasado;
			return this;
		}

		public Builder setEstaReservado(boolean estaReservado) {
			this.estaReservado = estaReservado;
			return this;
		}

		public Main build() {
			return new Main(emprestado, perdido, diasEmprestado, diasReservado, estaAtrasado, estaReservado);
		}
	}
	
	//Métodos
	protected void alterarStatus(boolean novoStatus) {
		emprestado = novoStatus;
	}
	
	//Sets
	private void setEmprestado(boolean novoEmprestado) {
		emprestado = novoEmprestado;
	}
	
	private void setPerdido(boolean novoPerdido) {
		perdido = novoPerdido;
	}
	
	private void setDiasEmprestado(int novoDiasEmprestados) {
		diasEmprestado = novoDiasEmprestados;
	}
	
	private void setEstaAtrasado(int novoDiasReservados) {
		diasReservado = novoDiasReservados;
	}
	
	private void setEstaReservado(boolean novoEstaAtrasado) {
		estaAtrasado = novoEstaAtrasado;
	}
	
	private void setExemplares(boolean novoEstaReservado) {
		estaReservado = novoEstaReservado;
	}
	
	//Gets
	public boolean getEmprestado() {
		return emprestado;
	}
	
	public boolean getPerdido() {
		return perdido;
	}
	
	public int getDiasEmprestado() {
		return diasEmprestado;
	}
	
	public int getDiasReservado() {
		return diasReservado;
	}
	
	public boolean getEstaAtrasado () {
		return estaAtrasado;
	}
	
	public boolean getEstaReservado() {
		return estaReservado;
	}
	
}
