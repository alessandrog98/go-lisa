import json
import subprocess
import os
import shlex

# Carica il file JSON
with open('../commands.json', 'r') as file:
    data = json.load(file)

# Funzione per eseguire un comando
def esegui_comando(comando, analisi,file_name,category):

    # Aggiungi ogni elemento dell'analisi al comando
    for analisi_item in analisi:
        # Crea la cartella se non esiste già
        percorso_cartella = './output/'+category+'/'+file_name+'/'+analisi_item
        if not os.path.exists(percorso_cartella):
            os.makedirs(percorso_cartella)
            #print(f"Cartella '{percorso_cartella}' creata con successo.")
            #print(f"La cartella '{file_name}' esiste già.")
        # Sostituisci _NOMEFILE_ con il nome del file
        comando = comando.replace('_NOMEFILE_', file_name)
        comando = comando.replace('_ANALISI_', analisi_item)
        comando = comando.replace('_CATEGORY_', category)

        comando_completo = f"{comando}{analisi_item}"
        args = shlex.split(comando_completo)
        
        # Verifica se l'eseguibile esiste
        eseguibile = args[0]
        #print(f"Verifica dell'eseguibile: {os.path.abspath(eseguibile)}")
        if not os.path.exists(eseguibile):
            print(f"Errore: l'eseguibile '{eseguibile}' non esiste.")
            continue
        try:
            print(f"Output per {comando_completo}")
            result = subprocess.run(args, check=True, capture_output=True, text=True)
        except subprocess.CalledProcessError as e:
            print(f"Errore nell'eseguire il comando {comando_completo}: {e.stderr}")

# Itera attraverso le chiavi e i valori nel JSON
for category, files in data.items():
    current_directory = os.getcwd()
    #print(f"Directory corrente: {current_directory}")
    #print(f"Analisi per la categoria {category}")
    go_lisa_dir = './go-lisa/go-lisa'
    if os.path.exists(go_lisa_dir):
        os.chdir(go_lisa_dir)
        #print(f"Directory corrente cambiata a: {go_lisa_dir}")
    for file_name, details in files.items():
        comando = details['comando']
        analisi = details['analisi']
        esegui_comando(comando, analisi, file_name,category)
