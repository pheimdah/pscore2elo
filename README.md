# ÅSSF IPSC ELO ratings

Match results are grabbed from the web and stored in JSON files.

Each match is divided into divisions and stages. Each stage is divided into separate encounters. Each encounter has a winner and a loser. Hit factor is disregarded except for determining a winner and a loser.

Shooters start with an ELO rank of 1000. K-factor is fixed at 24.

<details>
<summary>Example</summary>

Stage result with N=4 shooters:

1. Alfred
2. Björn
3. Calle
4. Daniel

This results in N-1 encounter per participant.

- Alfred won against Björn
- Alfred won against Calle
- Alfred won against Daniel
- Björn won against Calle
- Björn won against Daniel
- Calle won against Daniel

With regards to the scoring each encounter is counted as a match.
</details>

#### Compile & run
```
$ javac -cp lib/* -d target/classes src/*.java
$ java -cp lib/*;target/classes Main
```

## Ranking
```
Loaded 50 handgun stages
Loaded 30 mini_rifle stages
Loaded 34 pcc stages
Loaded 28 rifle stages
Loaded 0 shotgun stages

1v1 encounters: 4163
1v1 ignored encounters (shared last place at HF 0): 64

Processed in 172 ms
```

### Handgun Classic
<details>
<summary>Hidden</summary>

1. **A. Svensson** (ELO rating of 1061 after 16 stages)
1. **F. Andersson** (ELO rating of 939 after 16 stages)
</details>

### Handgun Open
<details>
<summary>Hidden</summary>

1. **T. Mörn** (ELO rating of 1043 after 4 stages)
1. **T. Nordqvist** (ELO rating of 957 after 4 stages)
</details>

### Handgun Production
<details>
<summary>Hidden</summary>

1. **J. Lindholm** (ELO rating of 1443 after 84 stages)
1. **E. Pettersson** (ELO rating of 1343 after 132 stages)
1. **J. Lindén** (ELO rating of 1319 after 62 stages)
1. **T. Nordqvist** (ELO rating of 1249 after 49 stages)
1. **N. Granlund** (ELO rating of 1206 after 28 stages)
1. **P. Heimdahl** (ELO rating of 1174 after 223 stages)
1. **G. Mörn** (ELO rating of 1171 after 143 stages)
1. **J. Back** (ELO rating of 1121 after 84 stages)
1. **S. Welin** (ELO rating of 1103 after 132 stages)
1. **A. Häger** (ELO rating of 1031 after 24 stages)
1. **J. Fyrqvist** (ELO rating of 1017 after 108 stages)
1. **D. Källroos** (ELO rating of 1012 after 100 stages)
1. **A. Norkvist** (ELO rating of 1005 after 48 stages)
1. **T. Mörn** (ELO rating of 965 after 84 stages)
1. **J. Welin** (ELO rating of 959 after 164 stages)
1. **A. Svensson** (ELO rating of 939 after 25 stages)
1. **L. Pettersson** (ELO rating of 937 after 84 stages)
1. **N. Häggblom** (ELO rating of 935 after 103 stages)
1. **D. Gustafsson** (ELO rating of 934 after 6 stages)
1. **F. Andersson** (ELO rating of 930 after 12 stages)
1. **F. Degerth** (ELO rating of 890 after 48 stages)
1. **M. Stenroos** (ELO rating of 868 after 16 stages)
1. **T. Stjernlöf** (ELO rating of 836 after 24 stages)
1. **P. Sundblom** (ELO rating of 828 after 84 stages)
1. **P. Jansson** (ELO rating of 795 after 121 stages)
1. **M. Nilsson** (ELO rating of 790 after 24 stages)
1. **L. Heinola** (ELO rating of 758 after 48 stages)
1. **S. Stenroos** (ELO rating of 749 after 84 stages)
1. **D. Back** (ELO rating of 693 after 84 stages)
</details>

### Handgun Production Optics
<details>
<summary>Hidden</summary>

1. **T. Bonn** (ELO rating of 1205 after 54 stages)
1. **J. Lindholm** (ELO rating of 1133 after 26 stages)
1. **E. Pettersson** (ELO rating of 1081 after 24 stages)
1. **S. Welin** (ELO rating of 979 after 34 stages)
1. **J. Back** (ELO rating of 960 after 38 stages)
1. **T. Dahlman** (ELO rating of 938 after 8 stages)
1. **N. Öberg** (ELO rating of 860 after 23 stages)
1. **D. Back** (ELO rating of 844 after 61 stages)
</details>

### Handgun Standard
<details>
<summary>Hidden</summary>

1. **T. Mörn** (ELO rating of 1202 after 127 stages)
1. **P. Heimdahl** (ELO rating of 1199 after 92 stages)
1. **J. Lindén** (ELO rating of 1192 after 38 stages)
1. **D. Källroos** (ELO rating of 1178 after 38 stages)
1. **T. Bonn** (ELO rating of 1128 after 8 stages)
1. **N. Öberg** (ELO rating of 1086 after 24 stages)
1. **S. Stenroos** (ELO rating of 1071 after 124 stages)
1. **A. Norkvist** (ELO rating of 1057 after 11 stages)
1. **L. Pettersson** (ELO rating of 1001 after 54 stages)
1. **T. Berlin** (ELO rating of 1000 after 12 stages)
1. **A. Rothberg** (ELO rating of 993 after 41 stages)
1. **D. Eklund** (ELO rating of 984 after 36 stages)
1. **J. Welin** (ELO rating of 958 after 54 stages)
1. **G. Mörn** (ELO rating of 944 after 95 stages)
1. **T. Nordqvist** (ELO rating of 930 after 100 stages)
1. **R. Eriksson** (ELO rating of 895 after 24 stages)
1. **P. Sundblom** (ELO rating of 807 after 54 stages)
1. **B. Granlund** (ELO rating of 804 after 54 stages)
1. **P. Jansson** (ELO rating of 803 after 32 stages)
1. **L. Heinola** (ELO rating of 768 after 76 stages)
</details>

### Mini Rifle Open
<details>
<summary>Hidden</summary>

1. **J. Lindén** (ELO rating of 1376 after 114 stages)
1. **S. Welin** (ELO rating of 1232 after 99 stages)
1. **J. Welin** (ELO rating of 1108 after 134 stages)
1. **T. Mörn** (ELO rating of 1108 after 151 stages)
1. **N. Granlund** (ELO rating of 1084 after 9 stages)
1. **P. Heimdahl** (ELO rating of 1031 after 54 stages)
1. **A. Svensson** (ELO rating of 1028 after 123 stages)
1. **F. Andersson** (ELO rating of 1027 after 112 stages)
1. **P. Sundblom** (ELO rating of 1024 after 40 stages)
1. **D. Back** (ELO rating of 971 after 32 stages)
1. **T. Dahlman** (ELO rating of 933 after 56 stages)
1. **L. Heinola** (ELO rating of 820 after 54 stages)
1. **A. Norkvist** (ELO rating of 807 after 54 stages)
1. **D. Gustafson** (ELO rating of 777 after 70 stages)
1. **B. Granlund** (ELO rating of 674 after 72 stages)
</details>

### Mini Rifle Standard
### PCC Iron
### PCC Optics
<details>
<summary>Hidden</summary>

1. **G. Mörn** (ELO rating of 1258 after 142 stages)
1. **J. Lindén** (ELO rating of 1227 after 37 stages)
1. **T. Bonn** (ELO rating of 1205 after 33 stages)
1. **T. Mörn** (ELO rating of 1163 after 117 stages)
1. **D. Källroos** (ELO rating of 1122 after 28 stages)
1. **E. Pettersson** (ELO rating of 1112 after 15 stages)
1. **J. Lindblom** (ELO rating of 1012 after 6 stages)
1. **S. Welin** (ELO rating of 1006 after 42 stages)
1. **N. Öberg** (ELO rating of 983 after 70 stages)
1. **P. Heimdahl** (ELO rating of 937 after 112 stages)
1. **F. Andersson** (ELO rating of 907 after 76 stages)
1. **A. Norkvist** (ELO rating of 900 after 42 stages)
1. **P. Jansson** (ELO rating of 879 after 24 stages)
1. **L. Heinola** (ELO rating of 851 after 88 stages)
1. **A. Svensson** (ELO rating of 822 after 52 stages)
1. **B. Gustafsson** (ELO rating of 820 after 42 stages)
1. **N. Häggblom** (ELO rating of 796 after 24 stages)
</details>

### Rifle Manual Action Bolt
### Rifle Manual Action Contemporary
### Rifle Semi Auto Open
<details>
<summary>Hidden</summary>

1. **S. Welin** (ELO rating of 1421 after 152 stages)
1. **T. Mörn** (ELO rating of 1407 after 206 stages)
1. **N. Öberg** (ELO rating of 1212 after 144 stages)
1. **J. Lindholm** (ELO rating of 1175 after 28 stages)
1. **S. Stenroos** (ELO rating of 1171 after 51 stages)
1. **A. Häger** (ELO rating of 1170 after 86 stages)
1. **P. Heimdahl** (ELO rating of 1078 after 132 stages)
1. **G. Mörn** (ELO rating of 1051 after 71 stages)
1. **T. Bonn** (ELO rating of 1025 after 24 stages)
1. **J. Welin** (ELO rating of 1023 after 206 stages)
1. **J. Lindén** (ELO rating of 1002 after 155 stages)
1. **J. Back** (ELO rating of 980 after 126 stages)
1. **A. Svensson** (ELO rating of 977 after 30 stages)
1. **J. Fyrqvist** (ELO rating of 969 after 89 stages)
1. **D. Back** (ELO rating of 958 after 85 stages)
1. **A. Norkvist** (ELO rating of 941 after 81 stages)
1. **N. Häggblom** (ELO rating of 902 after 86 stages)
1. **N. Granlund** (ELO rating of 891 after 22 stages)
1. **J. Grönqvist** (ELO rating of 888 after 177 stages)
1. **G. Gottberg** (ELO rating of 854 after 28 stages)
1. **B. Granlund** (ELO rating of 817 after 105 stages)
1. **P. Jansson** (ELO rating of 751 after 149 stages)
1. **F. Andersson** (ELO rating of 669 after 97 stages)
1. **P. Sundblom** (ELO rating of 668 after 130 stages)
</details>

### Rifle Semi Auto Standard
<details>
<summary>Hidden</summary>

1. **S. Cederberg** (ELO rating of 1132 after 34 stages)
1. **J. Lindén** (ELO rating of 1007 after 23 stages)
1. **D. Gustafson** (ELO rating of 995 after 6 stages)
1. **P. Heimdahl** (ELO rating of 991 after 29 stages)
1. **L. Heinola** (ELO rating of 981 after 4 stages)
1. **S. Stenroos** (ELO rating of 894 after 16 stages)
</details>

### Shotgun Modified
### Shotgun Open
### Shotgun Standard
### Shotgun Standard Manual
