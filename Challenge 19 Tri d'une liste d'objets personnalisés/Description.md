# Tri d'une liste d'objets personnalisés


### Écrivez une methode Java nommée trierParAge pour trier une liste d'objets personnes en fonction de l'âge et en utilisant un Comparator.


#### Indice:

class Personne {

private String nom;

private int age;

public Personne(String nom, int age) {

this.nom = nom;

this.age = age;

}

public String getNom() {

return nom;

}

public int getAge(){ 

return age;

}

}

### Exemple de sortie :


- Liste avant le tri :
- Personne{nom='Alice', age=25}
- Personne{nom='Bob', age=30}
- Personne{nom='Charlie', age=20}

---

- Liste après le tri par âge :
- Personne{nom='Charlie', age=20}
- Personne{nom='Alice', age=25}
- Personne{nom='Bob', age=30}