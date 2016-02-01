# Hibernate Session Interceptor #

The Interceptor class is **com.googlecode.s2hibernate.struts2.plugin.s2hibernatesession.HibernateSessionInterceptor**


# Package _hibernatesession-default_ (version 1.5+) #

> Since **1.5** version you can use the **hibernatesession-default**, that extends **struts-defaults**. This have 2 special Interceptor Stacks:

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

> The default stack for this package is the **defaultStackWithHibernateSession**.

> The **hibernateSessionInterceptor** here is the

**com.googlecode.s2hibernate.struts2.plugin.s2hibernatesession.HibernateSessionInterceptor** with no parameter (see the topic **Paratemers for Custom Stacks**).



# Configuration Constants by Project _(version 1.5+)_ #

> Since **1.5** version you can configure the plugin once by project using configuration constants. Thie can be done in **struts.properties** or in **struts.xml** (using the **constant** tag).

> The contants are:

  * **_struts2hibernateplugin.defaults.sessionFactoryClass_** - Project Hibernate Session Factory
Example: com.myproject.hibernate.HibernateSessionFactory

  * **_struts2hibernateplugin.defaults.sessionSource_** - Getter in the class named in _sessionFactoryClass_ that returns a Hibernate Sessoin
Example: _session_ (indicates the _getSessao()_ method)

  * **_struts2hibernateplugin.defaults.target_** - Target object in Action. Since **1.5b** version, you can use **Wildcard** (asterisk `*`)
Examples: _hibernateSession_; _facade.hibernateSession_

Examples using **wildcard** (since **1.5b** version): _hibernateSession`*`_; _`*`Facade.hibernateSession_

  * **_struts2hibernateplugin.defaults.staticGetSessionMethod_** - Is the method named in _sessionSource_ static?. Optional. Default **true**.

  * **_struts2hibernateplugin.defaults.closeSessionAfterInvoke_** - Close the Hibernate Session after Action invokation? Optional. Default **true**.


> _**Important!**_
> > Also using this constants, you can create custom Interceptor Stacks with diferent configurations, using paratemers (see the topic **Paratemers for Custom Stacks**).


# Paratemers for Custom Stacks #

  * **_sessionFactoryClass_** - Project Hibernate Session Factory

  * **_sessionSource_** - Getter in the class named in _sessionFactoryClass_ that returns a Hibernate Sessoin

  * **_target_** - Target object in Action. Since **1.5b** version, you can use **Wildcard** (asterisk)

  * **_staticGetSessionMethod_** - Is the method named in _sessionSource_ static?. Optional. Default **true**.

  * **_closeSessionAfterInvoke_** - Close the Hibernate Session after Action invokation? Optional. Default **true**.