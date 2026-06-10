# Wireshark demo

1. Åbn Wireshark.
2. Vælg det aktive netværkskort, for eksempel Wi-Fi.
3. Start capture.
4. Kør en simpel kommando i terminalen:

   `curl http://neverssl.com`

5. Stop capture.
6. Brug filteret:

   `tcp`

7. Brug filteret:

   `http`

8. Find pakker med `src` og `dst`.
9. Forklar source port og destination port.
10. Find TCP handshake med SYN, SYN-ACK og ACK.

