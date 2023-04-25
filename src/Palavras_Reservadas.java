
public class Palavras_Reservadas {
	
	//PALAVRAS RESERVADAS
	/**
	 * 
	 *  Palavras reservadas, s�o identificadores de uma linguagem que j� possuem uma
	 *   finalidade espec�fica, portanto, n�o podem ser utilizados para nomear 
	 *   vari�veis, classes, m�todos ou atributos.
	 *  A linguagem Java possui 52 palavras reservadas. 
	 *  Todas essas palavras s�o classificadas em grupos e escritas com letra min�scula,
	 *   sendo identificadas com uma cor especial pela maioria das IDE's. 
	 *   Abaixo temos a lista de palavras agrupadas por suas finalidades.
	 * 
	 */
	
		//PALAVRAS RESERVADAS
		/**
		 * 
		 * (abstract)  - (continue)   - (goto)    	 - (package)  - (synchronized)
		 * (assert)    - (default)    - (if)      	 - (private)  - (this)
		 * (boolean)   - (do)         - (implements) - (protected)- (throw)
		 * (break)     - (double)     - (import)     - (public)   - (throws)
		 * (byte)      - (else)       - (instanceof) - (return)   - (transient)
		 * (case)      - (extends)    - (int)        - (short)    - (try)
		 * (catch)     - (final)      - (interface)  - (static)   - (void)
		 * (char)      - (finally)    - (long)       - (strictfp) - (volatile)
		 * (class)     - (float)      - (native)     - (super)    - (while)
		 * (const)     - (for)        - (new)        - (switch)   
		 */
	
		//controle de pacotes
		/**
		 * 
		 * import: importa pacotes ou classes para dentro do c�digo;
		 * package: especifica a que pacote, todas as classes de um arquivo pertencem.
		 * 
		 */
	
		//modificadores de acesso
		/**
		 * 
		 * public: acesso de qualquer classe;
		 * private: acesso apenas dentro da classe;
		 * protected: acesso por classes no mesmo pacote e subclasses.
		 * 
		 */
	
		//primitivos
		/**
		 * 
		 * 	boolean: um valor indicando verdadeiro ou falso;
		 *  byte: um inteiro de 8 bits (signed);
		 *  char: um character unicode (16-bit unsigned);
		 *  double: um n�mero de ponto flutuante de 64 bits (signed);
		 *  float: um n�mero de ponto flutuante de 32 bits (signed);
		 *  int: um inteiro de 32 bits (signed);
		 *  long: um inteiro de 64 bits (signed);
		 *  short: um inteiro de 32 bits (signed);
		 *  void: indica que o m�todo n�o tem retorno de valor.
		 * 
		 * 
		 */
		
			//modificadores de classes, variaveis ou metodos
		
		/**
		 * 
		 *  abstract: classe que n�o pode ser instanciada ou m�todo que precisa ser implementado, por uma subclasse n�o abstrata;
		 *  
		 *  class: especifica uma classe;
    	 *  
    	 *  extends: indica a superclasse que a subclasse est� estendendo;
		 *  
		 *  final: impossibilita que uma classe seja estendida, que um m�todo seja sobrescrito ou que uma vari�vel seja reinicializada;
		 *  
		 *  implements: indica as interfaces que uma classe ir� implementar;
		 *  
		 *  interface: especifica uma interface;
		 *  
		 *  native: indica que um m�todo est� escrito em uma linguagem dependente de plataforma, como o C;
		 *  
		 *  new: instancia um novo objeto, chamando seu construtor;
		 *  
		 *  static: faz um m�todo ou vari�vel pertencer � classe ao inv�s de �s inst�ncias;
		 *  
		 *  strictfp: usado em frente a um m�todo ou classe para indicar que os n�meros de ponto flutuante seguir�o as regras de ponto flutuante, em todas as express�es;
		 *  
		 *  synchronized: indica que um m�todo s� pode ser acessado por uma thread de cada vez
		 *  
		 *  transient: impede a serializa��o de campos;
		 *  
		 *  volatile: indica que uma vari�vel pode ser alterada durante o uso de threads.;
		 * 
		 */
		
				//controle de fluxo de um bloco de c�digo
			/**
			 * 
			 *  break: sai do bloco de c�digo em que ele est�;
			 *	
			 *	case: executa um bloco de c�digo dependendo do teste do switch;
			 *	
			 *	continue: pula a execu��o do c�digo que viria, ap�s essa linha e vai para a pr�xima passagem do loop;
			 *	
			 *	default: executa esse bloco de c�digo caso nenhum dos teste de switch-case seja verdadeiro;
			 *	
			 *	do: executa um bloco de c�digo uma vez, e ent�o realiza um teste em conjunto com o while para determinar se o bloco dever� ser executado novamente;
			 *	
			 *	else: executa um bloco de c�digo alternativo caso o teste "if" seja falso;
			 *	
			 *	for: usado para realizar um loop condicional de um bloco de c�digo;
			 *	
			 *	if: usado para realizar um teste l�gico de verdadeiro ou falso;
			 *	
			 *	instanceof: determina se um objeto � uma inst�ncia de determinada classe, superclasse ou interface;
			 *	
			 *	return: retorna um m�todo sem executar qualquer c�digo, que venha depois desta linha (tamb�m pode retornar uma vari�vel);
			 *	
			 *	switch: indica a vari�vel a ser comparada nas express�es case;
			 *	
			 *	while: executa um bloco de c�digo repetidamente enquanto a condi��o for verdadeira.
			 * 
			 * 
			 * 
			 */
	
				//tratamento de erros
			
			/**
			 * 
			 *  assert: testa uma express�o condicional, para verificar uma suposi��o do programador;
			 *	
			 *	catch: declara o bloco de c�digo usado para tratar uma exce��o;
			 *	
			 *	finally: bloco de c�digo, ap�s um try-catch, que � executado independentemente do fluxo de programa seguido ao lidar com uma exce��o;
			 *	
			 *	throw: usado para passar uma exce��o para o m�todo que o chamou;
			 *	
			 *	throws: indica que um m�todo pode passar uma exce��o para o m�todo que o chamou;
			 *	
			 *	try: bloco de c�digo que tentar� ser executado, mas que pode causar uma exce��o.
			 * 
			 * 
			 */

				//variaveis de referencia
				/**
				 * super: refere-se a superclasse imediata;
				 *  this: refere-se a inst�ncia atual do objeto.
				 *  
				 */

	
				//palavras reservadas nao utilizadas 
				/**
				 * 
				 *  const: N�o utilize para declarar constantes; use public static final;
				 *  goto: n�o implementada na linguagem Java, por ser considerada prejudicial.
				 * 
				 */
	
					//literais reservados
	
					/**
					 * 
					 * De acordo com a Java Language Specification, null, 
					 * true e false s�o tecnicamente chamados de valores literais, 
					 * e n�o keywords. Se voc� tentar criar algum identificador com estes valores,
					 *  voc� tamb�m ter� um erro de compila��o.
					 * 
					 */
					
}
