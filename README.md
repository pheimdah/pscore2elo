# ÅSSF IPSC ELO ratings

Match results are grabbed from the web and stored in JSON files.

Each match is divided into divisions and stages. Each stage is divided into separate encounters. Each encounter has a winner and a loser. Hit factor is disregarded except for determining a winner and a loser.

Shooters start with an ELO rank of 1000. K-factor is fixed at 25.

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

Processed in 157 ms
```

### Handgun Classic
<details>
<summary>Hidden</summary>

1. **A. Svensson** (ELO rating of 1066 after 16 stages)
1. **F. Andersson** (ELO rating of 935 after 16 stages)
</details>

### Handgun Open
<details>
<summary>Hidden</summary>

1. **T. Mörn** (ELO rating of 1046 after 4 stages)
1. **T. Nordqvist** (ELO rating of 955 after 4 stages)
</details>

### Handgun Production
<details>
<summary>Hidden</summary>

1. **J. Lindholm** (ELO rating of 1461 after 84 stages)
1. **E. Pettersson** (ELO rating of 1349 after 132 stages)
1. **J. Lindén** (ELO rating of 1328 after 62 stages)
1. **T. Nordqvist** (ELO rating of 1257 after 49 stages)
1. **N. Granlund** (ELO rating of 1217 after 28 stages)
1. **P. Heimdahl** (ELO rating of 1179 after 223 stages)
1. **G. Mörn** (ELO rating of 1176 after 143 stages)
1. **J. Back** (ELO rating of 1125 after 84 stages)
1. **S. Welin** (ELO rating of 1111 after 132 stages)
1. **A. Häger** (ELO rating of 1034 after 24 stages)
1. **J. Fyrqvist** (ELO rating of 1025 after 108 stages)
1. **D. Källroos** (ELO rating of 1013 after 100 stages)
1. **A. Norkvist** (ELO rating of 1010 after 48 stages)
1. **T. Mörn** (ELO rating of 967 after 84 stages)
1. **J. Welin** (ELO rating of 957 after 164 stages)
1. **N. Häggblom** (ELO rating of 939 after 103 stages)
1. **L. Pettersson** (ELO rating of 939 after 84 stages)
1. **A. Svensson** (ELO rating of 938 after 25 stages)
1. **D. Gustafsson** (ELO rating of 931 after 6 stages)
1. **F. Andersson** (ELO rating of 929 after 12 stages)
1. **F. Degerth** (ELO rating of 890 after 48 stages)
1. **M. Stenroos** (ELO rating of 867 after 16 stages)
1. **T. Stjernlöf** (ELO rating of 833 after 24 stages)
1. **P. Sundblom** (ELO rating of 829 after 84 stages)
1. **P. Jansson** (ELO rating of 801 after 121 stages)
1. **M. Nilsson** (ELO rating of 779 after 24 stages)
1. **L. Heinola** (ELO rating of 755 after 48 stages)
1. **S. Stenroos** (ELO rating of 746 after 84 stages)
1. **D. Back** (ELO rating of 690 after 84 stages)
</details>

### Handgun Production Optics
<details>
<summary>Hidden</summary>

1. **T. Bonn** (ELO rating of 1209 after 54 stages)
1. **J. Lindholm** (ELO rating of 1139 after 26 stages)
1. **E. Pettersson** (ELO rating of 1085 after 24 stages)
1. **S. Welin** (ELO rating of 981 after 34 stages)
1. **J. Back** (ELO rating of 958 after 38 stages)
1. **T. Dahlman** (ELO rating of 934 after 8 stages)
1. **N. Öberg** (ELO rating of 857 after 23 stages)
1. **D. Back** (ELO rating of 842 after 61 stages)
</details>

### Handgun Standard
<details>
<summary>Hidden</summary>

1. **T. Mörn** (ELO rating of 1206 after 127 stages)
1. **P. Heimdahl** (ELO rating of 1202 after 92 stages)
1. **J. Lindén** (ELO rating of 1200 after 38 stages)
1. **D. Källroos** (ELO rating of 1184 after 38 stages)
1. **T. Bonn** (ELO rating of 1132 after 8 stages)
1. **N. Öberg** (ELO rating of 1092 after 24 stages)
1. **S. Stenroos** (ELO rating of 1077 after 124 stages)
1. **A. Norkvist** (ELO rating of 1059 after 11 stages)
1. **T. Berlin** (ELO rating of 1003 after 12 stages)
1. **L. Pettersson** (ELO rating of 1000 after 54 stages)
1. **A. Rothberg** (ELO rating of 996 after 41 stages)
1. **D. Eklund** (ELO rating of 985 after 36 stages)
1. **J. Welin** (ELO rating of 956 after 54 stages)
1. **G. Mörn** (ELO rating of 939 after 95 stages)
1. **T. Nordqvist** (ELO rating of 931 after 100 stages)
1. **R. Eriksson** (ELO rating of 894 after 24 stages)
1. **P. Sundblom** (ELO rating of 807 after 54 stages)
1. **B. Granlund** (ELO rating of 803 after 54 stages)
1. **P. Jansson** (ELO rating of 798 after 32 stages)
1. **L. Heinola** (ELO rating of 767 after 76 stages)
</details>

### Mini Rifle Open
<details>
<summary>Hidden</summary>

1. **J. Lindén** (ELO rating of 1383 after 114 stages)
1. **S. Welin** (ELO rating of 1240 after 99 stages)
1. **J. Welin** (ELO rating of 1115 after 134 stages)
1. **T. Mörn** (ELO rating of 1113 after 151 stages)
1. **N. Granlund** (ELO rating of 1088 after 9 stages)
1. **A. Svensson** (ELO rating of 1034 after 123 stages)
1. **P. Heimdahl** (ELO rating of 1032 after 54 stages)
1. **F. Andersson** (ELO rating of 1031 after 112 stages)
1. **P. Sundblom** (ELO rating of 1027 after 40 stages)
1. **D. Back** (ELO rating of 974 after 32 stages)
1. **T. Dahlman** (ELO rating of 933 after 56 stages)
1. **L. Heinola** (ELO rating of 818 after 54 stages)
1. **A. Norkvist** (ELO rating of 801 after 54 stages)
1. **D. Gustafson** (ELO rating of 777 after 70 stages)
1. **B. Granlund** (ELO rating of 670 after 72 stages)
</details>

### Mini Rifle Standard
### PCC Iron
### PCC Optics
<details>
<summary>Hidden</summary>

1. **G. Mörn** (ELO rating of 1259 after 142 stages)
1. **J. Lindén** (ELO rating of 1235 after 37 stages)
1. **T. Bonn** (ELO rating of 1212 after 33 stages)
1. **T. Mörn** (ELO rating of 1169 after 117 stages)
1. **D. Källroos** (ELO rating of 1128 after 28 stages)
1. **E. Pettersson** (ELO rating of 1118 after 15 stages)
1. **J. Lindblom** (ELO rating of 1011 after 6 stages)
1. **S. Welin** (ELO rating of 1006 after 42 stages)
1. **N. Öberg** (ELO rating of 990 after 70 stages)
1. **P. Heimdahl** (ELO rating of 935 after 112 stages)
1. **F. Andersson** (ELO rating of 909 after 76 stages)
1. **A. Norkvist** (ELO rating of 900 after 42 stages)
1. **P. Jansson** (ELO rating of 877 after 24 stages)
1. **L. Heinola** (ELO rating of 853 after 88 stages)
1. **A. Svensson** (ELO rating of 822 after 52 stages)
1. **B. Gustafsson** (ELO rating of 820 after 42 stages)
1. **N. Häggblom** (ELO rating of 791 after 24 stages)
</details>

### Rifle Manual Action Bolt
### Rifle Manual Action Contemporary
### Rifle Semi Auto Open
<details>
<summary>Hidden</summary>

1. **S. Welin** (ELO rating of 1431 after 152 stages)
1. **T. Mörn** (ELO rating of 1415 after 206 stages)
1. **N. Öberg** (ELO rating of 1218 after 144 stages)
1. **J. Lindholm** (ELO rating of 1184 after 28 stages)
1. **A. Häger** (ELO rating of 1179 after 86 stages)
1. **S. Stenroos** (ELO rating of 1178 after 51 stages)
1. **P. Heimdahl** (ELO rating of 1074 after 132 stages)
1. **G. Mörn** (ELO rating of 1056 after 71 stages)
1. **T. Bonn** (ELO rating of 1030 after 24 stages)
1. **J. Welin** (ELO rating of 1021 after 206 stages)
1. **J. Lindén** (ELO rating of 1002 after 155 stages)
1. **A. Svensson** (ELO rating of 979 after 30 stages)
1. **J. Back** (ELO rating of 977 after 126 stages)
1. **J. Fyrqvist** (ELO rating of 974 after 89 stages)
1. **D. Back** (ELO rating of 959 after 85 stages)
1. **A. Norkvist** (ELO rating of 941 after 81 stages)
1. **N. Häggblom** (ELO rating of 905 after 86 stages)
1. **N. Granlund** (ELO rating of 889 after 22 stages)
1. **J. Grönqvist** (ELO rating of 888 after 177 stages)
1. **G. Gottberg** (ELO rating of 852 after 28 stages)
1. **B. Granlund** (ELO rating of 817 after 105 stages)
1. **P. Jansson** (ELO rating of 752 after 149 stages)
1. **P. Sundblom** (ELO rating of 665 after 130 stages)
1. **F. Andersson** (ELO rating of 664 after 97 stages)
</details>

### Rifle Semi Auto Standard
<details>
<summary>Hidden</summary>

1. **S. Cederberg** (ELO rating of 1135 after 34 stages)
1. **J. Lindén** (ELO rating of 1007 after 23 stages)
1. **D. Gustafson** (ELO rating of 996 after 6 stages)
1. **P. Heimdahl** (ELO rating of 993 after 29 stages)
1. **L. Heinola** (ELO rating of 982 after 4 stages)
1. **S. Stenroos** (ELO rating of 891 after 16 stages)
</details>

### Shotgun Modified
### Shotgun Open
### Shotgun Standard
### Shotgun Standard Manual
