# Hibernate Session Interceptor #

A classe que funciona como Interceptor é a

**com.googlecode.s2hibernate.struts2.plugin.s2hibernatesession.HibernateSessionInterceptor**



# Pacote _hibernatesession-default_ (versão 1.5+) #

> A partir da versão **1.5** é oferecido o pacote **hibernatesession-default**, que é uma extenção do **struts-defaults**. Ele oferece 2 pilhas de Interceptors prontas:

**basicStackWithHibernateSession**
```
<interceptor-stack name="basicStackWithHibernateSession">
    <interceptor-ref name="hibernateSessionInterceptor"/>
    <interceptor-ref name="basicStack"/>
</interceptor-stack>
```

**defaultStackWithHibernateSession**
```
<interceptor-stack name="defaultStackWithHibernateSession">
    <interceptor-ref name="hibernateSessionInterceptor"/>
    <interceptor-ref name="defaultStack"/>
</interceptor-stack>
```

> A pilha padrão para este pacote é a **defaultStackWithHibernateSession**.

> O **hibernateSessionInterceptor** indicado em ambas as pilhas é o **com.googlecode.s2hibernate.struts2.plugin.s2hibernatesession.HibernateSessionInterceptor** sem nenhum parâmetro (veja o tópico **Parâmetros para configuração de Pilha personalizada**).




# Constantes de configuração por projeto _(versão 1.5+)_ #

> A partir da versão **1.5** é possivel definir configurações padrões para o Hibernate Session Plugin para todo o projeto. Tais constantes podem ser definidas tanto no arquivo **struts.properties** quanto no **struts.xml** usando-se a tag 

&lt;constant name="?" value="?" /&gt;



> As constantes de configuração são

  * **_struts2hibernateplugin.defaults.sessionFactoryClass_** - Classe que funciona como fábrica de sessões hibernate para o Projeto
Exemplo: com.meuprojeto.hibernate.HibernateSessionFactory

  * **_struts2hibernateplugin.defaults.sessionSource_** - Getter do método na classe indicada em _sessionFactoryClass_ que retorna a Sessão Hibernate
Exemplo: _sessaohib_ (o que equivale a um método _getSessaoHib()_)

  * **_struts2hibernateplugin.defaults.target_** - Objeto na Action que vai receber a Sessão Hibernate. É possivel usar o caractere **Coringa** (asterisco `*`), a partir da versão **1.5b**.
Exemplos: _sessaoHibernate_; _fachada.sessaoHibernate_

Exemplos com coringas (a partir da versão **1.5b**): _sessaoHibernate`*`_; _`*`Fachada.sessaoHibernate_

  * **_struts2hibernateplugin.defaults.staticGetSessionMethod_** - Indica se o método que retorna a Sessão

Hibernate é estático ou não. Opcional. Padrão **true**.

  * **_struts2hibernateplugin.defaults.closeSessionAfterInvoke_** - Indica se a Sessão Hibernate deve ser

ou não fechada após a invocação da action. Opcional. Padrão **true**.


> _**Atenção!**_
> Mesmo configurando essas constantes, é possível criar Pilhas de Interceptors personalizadas com configurações próprias (como indicado no tópico **Parâmetros para configuração de Pilha personalizada**)



# Parâmetros para configuração de Pilha personalizada #

  * **_sessionFactoryClass_** - Classe que funciona como fábrica de sessões hibernate para o Interceptor

  * **_sessionSource_** - Getter do método na classe indicada em _sessionFactoryClass_ que retorna a Sessão Hibernate

  * **_target_** - Objeto na Action que vai receber a Sessão Hibernate. É possivel usar o caractere **Coringa** (asterisco), a partir da versão **1.5b**.

  * **_staticGetSessionMethod_** - Indica se o método que retorna a Sessão Hibernate é estático ou não. Opcional. Padrão **true**.

  * **_closeSessionAfterInvoke_** - Indica se a Sessão Hibernate deve ser ou não fechada após a invocação da action. Opcional. Padrão **true**.