import json
import subprocess
import os
import shlex

# Carica il file JSON
with open('../commands.json', 'r') as file:
    data = json.load(file)

# Funzione per eseguire un comando
def esegui_comando(comando, analisi, file_name, category):
    # Apri il file di output in modalità di aggiunta
    with open('output.txt', 'a') as file_output:
        # Aggiungi ogni elemento dell'analisi al comando
        for analisi_item in analisi:
            # Crea la cartella se non esiste già
            percorso_cartella = f'./output/{category}/{file_name}/{analisi_item}'
            if not os.path.exists(percorso_cartella):
                os.makedirs(percorso_cartella)
            # Sostituisci _NOMEFILE_ con il nome del file e _ANALISI_ con l'analisi corrente
            comando_corrente = comando.replace('_NOMEFILE_', file_name).replace('_ANALISI_', analisi_item).replace('_CATEGORIA_', category)
            comando_corrente = comando_corrente + analisi_item
            # args = shlex.split(comando_corrente)
            # Scrivi il comando nel file di output
            
            file_output.write(f"{comando_corrente}\n")
            # Esegui il comando

# Itera attraverso le chiavi e i valori nel JSON
for category, files in data.items():
    current_directory = os.getcwd()
    go_lisa_dir = './go-lisa/go-lisa'
    if os.path.exists(go_lisa_dir):
        os.chdir(go_lisa_dir)
    for file_name, details in files.items():
        comando = details['comando']
        analisi = details['analisi']
        esegui_comando(comando, analisi, file_name, category)
