# CI/CD og GitHub Actions

CI/CD betyder, at man automatisk kan teste og bygge sin kode, når der sker ændringer.

I denne demo bruges GitHub Actions. En workflow-fil ligger i:

`.github/workflows/ci.yml`

Workflowet er et simpelt Java/Maven eksempel.

## Begreber

- `jobs`: en opgave, som GitHub Actions skal køre
- `steps`: de enkelte trin inde i et job
- `uses`: bruger en færdig GitHub Action
- `run`: kører en terminalkommando
- `cache`: gemmer dependencies, så næste kørsel kan være hurtigere
- `workflow_dispatch`: gør det muligt at starte workflowet manuelt

