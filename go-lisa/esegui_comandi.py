import subprocess
import os

# Percorso del file di testo contenente i comandi
file_comandi = "output.txt"
current_directory = os.getcwd()
print(f"Directory corrente: {current_directory}")
go_lisa_dir = './go-lisa'
if os.path.exists(go_lisa_dir):
    os.chdir(go_lisa_dir)
    print(f"Directory corrente cambiata a: {go_lisa_dir}")

# Apri il file di testo in modalità lettura
with open(file_comandi, 'r') as file:
    for riga in file:
        # Rimuovi eventuali spazi bianchi all'inizio e alla fine della riga
        riga = riga.strip()
        # Se la riga non è vuota, esegui il comando
        if riga:
            print(f"Esecuzione del comando: {riga}")
            # Suddividi la riga in una lista di argomenti
            args = riga.split()
            # Esegui il comando
            try:
                subprocess.run(args, check=True)
            except subprocess.CalledProcessError as e:
                print(f"Errore nell'eseguire il comando: {e}")