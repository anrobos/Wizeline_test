Feature: Login 
	@OK
	Scenario Outline: realizar logado correcto con usuario <user>
		Given Nos encontramos en la pagina inicial "Sample Website for Galen Framework"
		When pulsamos boton acceso al login
		Then Nos encontramos en pagina de login "Login"	
		When Introducimos usuario "<user>" y password "<password>"
		And pulsamos boton de logado	
		Then Nos encontramos logados en la pagina de bienvenida "My Notes"
		
	Examples:
	|user|password|
	| testuser@example.com | test123 |
	
	@KO #Es un ejemplo de test KO, pero existen varios mas: user bloqueado, sin rellenar campos o alguno de ellos, muchos caracteres, formatos no esperados, ect...
	Scenario Outline: realizar logado incorrecto con usuario <user>
		Given Nos encontramos en la pagina inicial "Sample Website for Galen Framework"
		When pulsamos boton acceso al login
		Then Nos encontramos en pagina de login "Login"	
		When Introducimos usuario "<user>" y password "<password>"
		And pulsamos boton de logado
		Then Nos encontramos un mensaje de error "The username or password are incorrect"
		
	Examples:
	|user|password|
	| invalido@example.com | test123 |
	
	
	


