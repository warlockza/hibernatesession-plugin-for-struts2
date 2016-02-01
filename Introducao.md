# Introdução #

É recomendado o uso do padrão "Open Session in View" para aplicações WEB com o Hibernate Core.

Este Plugin oferece um Interceptor  que abre uma Sessão Hibernate, coloca no Value Stack da Action e a fecha (ou não) após a Action ser invocada.

É possivel configurar o este plugin de uma vez para todo o projeto ou por pilha de Interceptors. Maiores detalhes em **Configurações**.


Exemplos de uso em **Downloads**