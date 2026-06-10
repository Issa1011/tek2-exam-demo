# TCP/IP og Wireshark

TCP/IP er de grundlæggende regler, som computere bruger til at sende data over netværk.

Wireshark kan vise netværkspakker, så man kan se trafik som DNS, TCP og HTTP.

## Begreber

- Lokal IP: IP-adressen på min computer i mit lokale netværk
- Public IP: IP-adressen mit netværk bruger ud mod internettet
- MAC-adresse: fysisk netværksadresse på det lokale netværk
- IP-adresse: logisk adresse, som bruges til at finde vej over netværk
- Router: sender trafik mellem forskellige netværk
- Switch: forbinder enheder på samme lokale netværk
- `src`: source, altså afsender
- `dst`: destination, altså modtager
- Source port: porten afsenderen bruger
- Destination port: porten modtageren bruger
- TCP handshake: SYN, SYN-ACK, ACK
- TCP: forbindelsesorienteret og kontrollerer levering
- UDP: hurtigere, men uden samme kontrol

Man kan normalt ikke se en fjern hjemmesides MAC-adresse, fordi MAC-adresser kun bruges på det lokale netværk. Når trafikken går gennem en router, skifter den lokale MAC-adresse undervejs.

