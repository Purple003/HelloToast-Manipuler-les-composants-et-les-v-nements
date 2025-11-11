# HelloToast

Petit projet Android réalisé dans le cadre du cours **Programmation Mobile (Android avec Java)**.  
L’application affiche un message **Toast** et incrémente un **compteur** à chaque clic.

---

## Objectif du TP

Apprendre à :
- Manipuler des **composants d’interface (TextView, Button)**.
- Gérer des **événements utilisateurs (onClick)**.
- Modifier dynamiquement le contenu à l’écran.

---

## Technologies

- **Langage** : Java  
- **Environnement** : Android Studio  
- **API minimum** : 24 (Android 7.0)  
- **Interface** : XML (LinearLayout)

---

## Fonctionnalités

| Bouton | Action |
|--------|--------|
| **Afficher un message** | Affiche un message *Toast* « Bonjour ! » |
| **Incrémenter le compteur** | Augmente la valeur affichée (0 → 1 → 2 …) |

---

## Structure du projet
<img width="569" height="514" alt="image" src="https://github.com/user-attachments/assets/dcee4357-aa05-403a-92bf-917561679fb8" />


---

## Démonstration

### Interface principale  
<img width="595" height="810" alt="Screenshot 2025-11-11 235653" src="https://github.com/user-attachments/assets/a03e97d2-0796-45dc-8f80-937d1722f7e3" />


### Vidéo démonstrative  


https://github.com/user-attachments/assets/511d20b2-8f6f-487b-b47c-a6c70a7dcc23


---

## Explication rapide du code

### `activity_main.xml`
Définit une interface simple :

```xml
<LinearLayout ...>
    <TextView ... />        <!-- Affiche le compteur -->
    <Button ... />          <!-- Afficher un Toast -->
    <Button ... />          <!-- Incrémenter le compteur -->
</LinearLayout>
```
## Explication rapide du code

### `MainActivity.java`
Contient la logique :

```java
buttonToast.setOnClickListener(v -> {
    Toast.makeText(this, "Bonjour !", Toast.LENGTH_SHORT).show();
});

buttonCount.setOnClickListener(v -> {
    count++;
    textCount.setText(String.valueOf(count));
});
```
## Exécution
- Ouvrir le projet dans Android Studio.
- Lancer un émulateur (Pixel 4, API 30) ou brancher un téléphone Android.
- Cliquer sur Run.
- Tester les boutons pour afficher le message et incrémenter le compteur.

### Auteur
- Nom : Arroche Aya
- Cours : Programmation Mobile – Android avec Java
- Date : Novembre 2025

