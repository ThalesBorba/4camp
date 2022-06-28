package br.com.fourcamp.basico.menu;

public enum Menu {
	
	SALVAR(1), IMPRIMIR(2), ABRIR(3), VISUALIZAR(4), FECHAR(5);
	
	private final int valor;
	
	private Menu(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}

	public static void escolheOpcaoMenu(int valorMenu) {
		if (valorMenu == Menu.SALVAR.getValor()) System.out.println("Salvando registro");
		else if (valorMenu == Menu.IMPRIMIR.getValor()) System.out.println("Imprimindo dados");
		else if (valorMenu == Menu.ABRIR.getValor()) System.out.println("Abrindo arquivo");
		else if (valorMenu == Menu.VISUALIZAR.getValor()) System.out.println("Visualizando registros");
		else if (valorMenu == Menu.FECHAR.getValor()) System.out.println("Fechando Arquivo");
			}
}
