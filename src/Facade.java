
public class Facade {

	private Rh rh;
	private Auditoria aud;
	private Agendamento agen;
	private Marketing mark;
	private Financeiro fina;

	public Facade() {
		this.rh = new Rh();
		this.aud = new Auditoria();
		this.agen = new Agendamento();
		this.mark = new Marketing();
		this.fina = new Financeiro();
	}
	
	public void cadastrar(Cantor C) {
		this.rh.cadastrar(C);
		this.aud.auditar(C);
		this.agen.agendar(C);
		this.mark.divulgar(C);
		this.fina.pagamento(C);
		System.out.println("\n");
	}

}
