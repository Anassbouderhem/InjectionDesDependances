# Injection des Dépendances - Java & Spring

## Auteur
**Nom et prénom :** BOUDERHEM Anass 
**Filière :** II-BDCC2
**Année :** 2025/2026

---

## Description
Ce projet illustre le concept d'injection des dépendances en Java,
avec les approches : statique / dynamique / et en utilisant le framework Spring (XML / Annotations)


---

## Partie 1 : Injection des Dépendances avec Spring

### Concept de Couplage Faible
Les classes métier dépendent des **interfaces** et non des implémentations concrètes.
Cela permet de changer l'implémentation sans modifier le code métier.

### Structure du projet
```
├───main
│   ├───java
│   │   ├───org
│   │   │   └───example
│   │   │           Main.java
│   │   └───tp
│   │       ├───dao
│   │       │       DaoImpl.java                        # Implémentation DAO
│   │       │       IDao.java                           # Interface DAO
│   │       │       
│   │       ├───ext
│   │       │       DaoImplV2.java                      # Extention métier

│   │       ├───metier
│   │       │       IMetier.java                        # Interface métier
│   │       │       MetierImpl.java                     # Implémentation métier
│   │       │       
│   │       └───presentation
│   │               Presentation1.java                  # Injection statique
│   │               Presentation2.java                  # Injection dynamique
│   │               PresentationSpringAnnotation.java   # Spring Annotations
│   │               PresentationSpringXML.java          # Spring XML
│   │               
│   └───resources
│           config.xml
└───test
    └───java
```
### Diagramme UML
![img_1.png](img.png)

### Les 4 méthodes d'injection

#### 1. Injection Statique
Injection manuel des dépendances directement dans le code.
```java
DaoImpl d = new DaoImpl();
MetierImpl metier = new MetierImpl(d);
```

#### 2. Injection Dynamique
Utilisation de la réflexion Java et d'un fichier de configuration texte.
```java
String daoClassName = scanner.nextLine();
Class cDao = Class.forName(daoClassName);
IDao d =(IDao) cDao.newInstance();
```

#### 3. Spring Version XML
Spring lit le fichier `config.xml` et crée les beans automatiquement.
```xml
<bean id="d" class="tp.dao.DaoImpl"></bean>
<bean id="metier" class="tp.metier.MetierImpl">
    <constructor-arg ref="d"></constructor-arg>
</bean>
```

#### 4. Spring Version Annotations
Spring scanne les packages et injecte les dépendances via les annotations.
```java
@Repository("dao")
public class DaoImpl implements IDao { ... }

@Service("metier")
public class MetierImpl implements IMetier {
    @Autowired
    @Qualifier("d2")
    private IDao dao;
}
```

## Technologies utilisées
| Technologie | Version |
|-------------|---------|
| Java | 22      |
| Spring Framework | 6.2.15   |
| Maven | 3.9.11  |


---

## Lancer le projet
```bash
# Cloner le repository
git clone https://github.com/Anassbouderhem/InjectionDesDependances.git

# Compiler
mvn clean install

# Exécuter
mvn exec:java -Dexec.mainClass="presentation.Main"
```