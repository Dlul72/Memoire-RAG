Objectif du projet :
Développer un agent intelligent (IA avec RAG – Retrieval-Augmented Generation) pour assister les analystes et banquiers dans les opérations de M&A. L’agent sera intégré dans une application Streamlit avec une interface simple et intuitive, découpée en plusieurs modules fonctionnels.
________________________________________

1. Interface de discussion avec l’agent IA
•	Fonctionnalité principale : dialogue naturel avec l’agent pour poser des questions sur les données de la dataroom ou des documents ajoutés.
•	Capacités :
o	Extraction automatique d’indicateurs financiers (EBITDA, marge brute, dettes nettes, etc.) à partir des rapports PDF ou Excel.
o	Possibilité d’ajouter de nouveaux documents à la base de données (upload) et de les indexer dynamiquement.
o	Réponses argumentées, avec mention des sources internes (nom du fichier, page, etc.).
________________________________________

2. Page de valorisation
•	Objectif : générer une valorisation type DCF de manière semi-automatique.
•	Fonctionnement :
o	L’utilisateur clique sur “Lancer une valorisation”.
o	Une fenêtre s’ouvre où il peut entrer ou valider certaines hypothèses clés (WACC, croissance à LT, CAPEX, etc.).
o	L’agent propose une évaluation complète : FCF, DCF, sensibilité, avec visualisation des résultats (graphiques).
o	Possibilité de sauvegarder les valorisations dans un historique.
________________________________________

3. Module de gestion de la dataroom
•	Vue interactive de l’arborescence des dossiers : permet de naviguer dans les fichiers de la dataroom.
•	Fonctions utiles :
o	Recherche par mot-clé dans tous les documents indexés.
o	Visualisation rapide des documents, annotation possible.
o	Possibilité de voir les documents récemment ajoutés, ou les plus consultés.
________________________________________

Technos / Logiciels envisagés :
•	Frontend : Streamlit (ou Gradio en option)  monétiser le Streamlit
•	Backend : Python (LangChain ou LlamaIndex pour le RAG)
•	Base de données / stockage : FAISS ou Chroma pour l’indexation vectorielle, stockage cloud local
•	Parsing docs : PyMuPDF, Pandas, openpyxl pour traiter PDF, Excel
•	Valorisation : utilisation de modèles Excel intégrés ou générés via code Python avec visualisation Matplotlib/Plotly
•	Connexion externe : intégrer une API comme Pappers pour enrichir automatiquement la base avec des données publiques sur les entreprises françaises (Kbis, bilans, dirigeants)
________________________________________
Pistes d’amélioration / Extensions possibles :
•	Connexion à une API bancaire ou financière (FactSet, Eikon, Pappers, etc.) pour entraîner ou enrichir les réponses.  API gratuite
•	Intégration d’un outil d’annotation collaborative (ex : tagging de documents ou commentaires).
•	Ajout d’un système de scoring des cibles (approche multi-critères).
•	Audit log des interactions avec l’IA pour des questions de traçabilité et validation.

Puis publication mémoire open-source Github.

