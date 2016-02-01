# 1.5c #

**Bug Fix 1** _(Since: 1.0)_

If the _setter_ marked as the **target** for the Hibernate Session is from the super class of the mapped Action a Exception is thrown. **Fixed since 1.5c**.




**New Feature 1**

Multiple packages can be extended with the **hibernatesession-default**.
Example:

```

<package name="myMainPackage" extends="hibernatesession-default,jasperreports-default, jfreechart-default,json-default" namespace="">
...
</package>

```