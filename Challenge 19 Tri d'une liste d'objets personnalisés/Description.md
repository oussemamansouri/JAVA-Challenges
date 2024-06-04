# Sorting a List of Custom Objects


### Write a Java method named sortAge to sort a list of person objects based on their age using a Comparator.


#### Hint:

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

### Example Output:


- List before sorting:
- Person{name='Alice', age=25}
- Person{name='Bob', age=30}
- Person{name='Charlie', age=20}

---

- List after sorting by age:
- Person{name='Charlie', age=20}
- Person{name='Alice', age=25}
- Person{name='Bob', age=30}