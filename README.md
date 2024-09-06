Système de Gestion de Bibliothèque Municipale Description du Projet

Ce projet consiste à développer une application console en Java 8 pour une bibliothèque municipale. L'objectif est de gérer efficacement l'inventaire des livres et magazines ainsi que les emprunts et retours. Cette application suit une architecture en couches, permettant une séparation claire des responsabilités. Architecture du Projet Couche de Présentation

Classe ConsoleUI : Interface utilisateur permettant d'interagir avec le système via la console. Cette classe gère le menu principal et les interactions utilisateur.

Couche Métier

Classe Abstraite Document :
    Attributs : id, titre, auteur, datePublication, nombreDePages
    Méthodes abstraites : emprunter(), retourner(), afficherDetails()

Classe Livre (hérite de Document) :
    Attribut supplémentaire : isbn
    Implémente les méthodes abstraites de Document.

Classe Magazine (hérite de Document) :
    Attribut supplémentaire : numero
    Implémente les méthodes abstraites de Document.

Classe Bibliotheque : Gère la collection de documents (livres et magazines). Elle permet l'ajout de documents, l'emprunt, le retour, l'affichage et la recherche de documents.

Couche Utilitaire

Classe DateUtils : Fournit des méthodes pour la manipulation des dates, utilisées principalement pour la validation des dates de publication et la gestion des dates d'emprunt et de retour.

Fonctionnalités Principales

Ajouter un document (livre ou magazine)
Emprunter un document
Retourner un document
Afficher tous les documents
Rechercher un document
Quitter l'application

Spécifications Techniques

Utilisation d'ArrayList<Document> pour stocker les documents.
Recherche rapide avec HashMap<String, Document>.
Intégration de Java Time API pour la gestion des dates.
Utilisation d'expressions lambda pour simplifier certaines opérations, comme les recherches dans la collection de documents.

Interface Utilisateur

Un menu interactif dans la console permet de naviguer entre les différentes options :

    Ajouter un document
    Emprunter un document
    Retourner un document
    Afficher tous les documents
    Rechercher un document
    Quitter

Veuillez entrer votre choix (1-6) :
