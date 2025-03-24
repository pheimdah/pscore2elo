# ÅSSF IPSC Elo ratings

Match results are grabbed from the web and stored in JSON files.

Each match is divided into divisions and stages. Each stage is divided into separate encounters. Each encounter has a winner and a loser. Hit factor is disregarded except for determining a winner and a loser.

Shooters start with an Elo rating of 1000. A shooter's K-factor is 40 for 30 encounters, then 20 until an rating of 2400 is achieved, after which K is lowered to 10.

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
Loaded 34 mini_rifle stages
Loaded 34 pcc stages
Loaded 28 rifle stages
Loaded 0 shotgun stages

1v1 encounters: 4377
1v1 ignored encounters (shared last place at HF 0): 69

Processed in 320 ms
```

### Handgun Classic
<details>
<summary>Expand</summary>

1. **A. Svensson** (Elo rating of 1081 after 16 encounters)
1. **F. Andersson** (Elo rating of 919 after 16 encounters)
</details>

### Handgun Open
<details>
<summary>Expand</summary>

1. **T. Mörn** (Elo rating of 1068 after 4 encounters)
1. **T. Nordqvist** (Elo rating of 932 after 4 encounters)
</details>

### Handgun Production
<details>
<summary>Expand</summary>

1. **J. Lindholm** (Elo rating of 1473 after 84 encounters)
1. **E. Pettersson** (Elo rating of 1342 after 132 encounters)
1. **J. Lindén** (Elo rating of 1338 after 62 encounters)
1. **N. Granlund** (Elo rating of 1281 after 28 encounters)
1. **T. Nordqvist** (Elo rating of 1253 after 49 encounters)
1. **G. Mörn** (Elo rating of 1153 after 143 encounters)
1. **J. Back** (Elo rating of 1143 after 84 encounters)
1. **P. Heimdahl** (Elo rating of 1139 after 223 encounters)
1. **S. Welin** (Elo rating of 1058 after 132 encounters)
1. **A. Häger** (Elo rating of 1032 after 24 encounters)
1. **D. Källroos** (Elo rating of 1004 after 100 encounters)
1. **J. Fyrqvist** (Elo rating of 978 after 108 encounters)
1. **J. Welin** (Elo rating of 949 after 164 encounters)
1. **A. Norkvist** (Elo rating of 909 after 48 encounters)
1. **T. Mörn** (Elo rating of 907 after 84 encounters)
1. **L. Pettersson** (Elo rating of 906 after 84 encounters)
1. **N. Häggblom** (Elo rating of 894 after 103 encounters)
1. **F. Andersson** (Elo rating of 892 after 12 encounters)
1. **A. Svensson** (Elo rating of 885 after 25 encounters)
1. **D. Gustafsson** (Elo rating of 882 after 6 encounters)
1. **M. Stenroos** (Elo rating of 815 after 16 encounters)
1. **F. Degerth** (Elo rating of 794 after 48 encounters)
1. **P. Sundblom** (Elo rating of 780 after 84 encounters)
1. **T. Stjernlöf** (Elo rating of 759 after 24 encounters)
1. **P. Jansson** (Elo rating of 721 after 121 encounters)
1. **S. Stenroos** (Elo rating of 718 after 84 encounters)
1. **L. Heinola** (Elo rating of 691 after 48 encounters)
1. **M. Nilsson** (Elo rating of 670 after 24 encounters)
1. **D. Back** (Elo rating of 661 after 84 encounters)
</details>

### Handgun Production Optics
<details>
<summary>Expand</summary>

1. **T. Bonn** (Elo rating of 1237 after 54 encounters)
1. **J. Lindholm** (Elo rating of 1181 after 26 encounters)
1. **E. Pettersson** (Elo rating of 1101 after 24 encounters)
1. **S. Welin** (Elo rating of 958 after 34 encounters)
1. **J. Back** (Elo rating of 955 after 38 encounters)
1. **T. Dahlman** (Elo rating of 904 after 8 encounters)
1. **D. Back** (Elo rating of 811 after 61 encounters)
1. **N. Öberg** (Elo rating of 785 after 23 encounters)
</details>

### Handgun Standard
<details>
<summary>Expand</summary>

1. **D. Källroos** (Elo rating of 1253 after 38 encounters)
1. **J. Lindén** (Elo rating of 1213 after 38 encounters)
1. **T. Bonn** (Elo rating of 1187 after 8 encounters)
1. **T. Mörn** (Elo rating of 1186 after 127 encounters)
1. **P. Heimdahl** (Elo rating of 1169 after 92 encounters)
1. **N. Öberg** (Elo rating of 1137 after 24 encounters)
1. **A. Norkvist** (Elo rating of 1088 after 11 encounters)
1. **S. Stenroos** (Elo rating of 1049 after 124 encounters)
1. **L. Pettersson** (Elo rating of 994 after 54 encounters)
1. **T. Berlin** (Elo rating of 988 after 12 encounters)
1. **A. Rothberg** (Elo rating of 985 after 41 encounters)
1. **D. Eklund** (Elo rating of 967 after 36 encounters)
1. **G. Mörn** (Elo rating of 947 after 95 encounters)
1. **J. Welin** (Elo rating of 926 after 54 encounters)
1. **T. Nordqvist** (Elo rating of 908 after 100 encounters)
1. **R. Eriksson** (Elo rating of 859 after 24 encounters)
1. **L. Heinola** (Elo rating of 771 after 76 encounters)
1. **P. Sundblom** (Elo rating of 744 after 54 encounters)
1. **B. Granlund** (Elo rating of 735 after 54 encounters)
1. **P. Jansson** (Elo rating of 727 after 32 encounters)
</details>

### Mini Rifle Open
<details>
<summary>Expand</summary>

1. **J. Lindén** (Elo rating of 1273 after 154 encounters)
1. **S. Welin** (Elo rating of 1227 after 99 encounters)
1. **T. Mörn** (Elo rating of 1199 after 191 encounters)
1. **A. Svensson** (Elo rating of 1162 after 163 encounters)
1. **N. Granlund** (Elo rating of 1122 after 9 encounters)
1. **D. Gustafsson** (Elo rating of 1081 after 40 encounters)
1. **F. Andersson** (Elo rating of 1057 after 149 encounters)
1. **P. Sundblom** (Elo rating of 1025 after 40 encounters)
1. **P. Heimdahl** (Elo rating of 1009 after 54 encounters)
1. **J. Welin** (Elo rating of 1006 after 174 encounters)
1. **J. Djupsund** (Elo rating of 984 after 40 encounters)
1. **D. Back** (Elo rating of 977 after 72 encounters)
1. **T. Dahlman** (Elo rating of 923 after 56 encounters)
1. **J. Fyrqvist** (Elo rating of 848 after 37 encounters)
1. **L. Heinola** (Elo rating of 774 after 54 encounters)
1. **D. Dahlblom** (Elo rating of 760 after 37 encounters)
1. **A. Norkvist** (Elo rating of 753 after 54 encounters)
1. **D. Gustafson** (Elo rating of 745 after 70 encounters)
1. **B. Granlund** (Elo rating of 622 after 109 encounters)
</details>

### Mini Rifle Standard
### PCC Iron
### PCC Optics
<details>
<summary>Expand</summary>

1. **J. Lindén** (Elo rating of 1301 after 37 encounters)
1. **T. Bonn** (Elo rating of 1266 after 33 encounters)
1. **G. Mörn** (Elo rating of 1231 after 142 encounters)
1. **E. Pettersson** (Elo rating of 1164 after 15 encounters)
1. **D. Källroos** (Elo rating of 1161 after 28 encounters)
1. **T. Mörn** (Elo rating of 1131 after 117 encounters)
1. **J. Lindblom** (Elo rating of 1021 after 6 encounters)
1. **S. Welin** (Elo rating of 972 after 42 encounters)
1. **N. Öberg** (Elo rating of 932 after 70 encounters)
1. **P. Heimdahl** (Elo rating of 920 after 112 encounters)
1. **F. Andersson** (Elo rating of 907 after 76 encounters)
1. **A. Norkvist** (Elo rating of 858 after 42 encounters)
1. **P. Jansson** (Elo rating of 818 after 24 encounters)
1. **L. Heinola** (Elo rating of 814 after 88 encounters)
1. **A. Svensson** (Elo rating of 775 after 52 encounters)
1. **B. Gustafsson** (Elo rating of 761 after 42 encounters)
1. **N. Häggblom** (Elo rating of 704 after 24 encounters)
</details>

### Rifle Manual Action Bolt
### Rifle Manual Action Contemporary
### Rifle Semi Auto Open
<details>
<summary>Expand</summary>

1. **S. Welin** (Elo rating of 1371 after 152 encounters)
1. **T. Mörn** (Elo rating of 1368 after 206 encounters)
1. **J. Lindholm** (Elo rating of 1238 after 28 encounters)
1. **S. Stenroos** (Elo rating of 1177 after 51 encounters)
1. **N. Öberg** (Elo rating of 1152 after 144 encounters)
1. **A. Häger** (Elo rating of 1129 after 86 encounters)
1. **P. Heimdahl** (Elo rating of 1069 after 132 encounters)
1. **G. Mörn** (Elo rating of 1031 after 71 encounters)
1. **T. Bonn** (Elo rating of 1029 after 24 encounters)
1. **J. Welin** (Elo rating of 1011 after 206 encounters)
1. **J. Lindén** (Elo rating of 999 after 155 encounters)
1. **J. Back** (Elo rating of 988 after 126 encounters)
1. **A. Svensson** (Elo rating of 955 after 30 encounters)
1. **D. Back** (Elo rating of 953 after 85 encounters)
1. **J. Fyrqvist** (Elo rating of 951 after 89 encounters)
1. **A. Norkvist** (Elo rating of 909 after 81 encounters)
1. **N. Häggblom** (Elo rating of 860 after 86 encounters)
1. **J. Grönqvist** (Elo rating of 852 after 177 encounters)
1. **G. Gottberg** (Elo rating of 796 after 28 encounters)
1. **B. Granlund** (Elo rating of 795 after 105 encounters)
1. **N. Granlund** (Elo rating of 795 after 22 encounters)
1. **P. Jansson** (Elo rating of 726 after 149 encounters)
1. **F. Andersson** (Elo rating of 682 after 97 encounters)
1. **P. Sundblom** (Elo rating of 656 after 130 encounters)
</details>

### Rifle Semi Auto Standard
<details>
<summary>Expand</summary>

1. **S. Cederberg** (Elo rating of 1150 after 34 encounters)
1. **P. Heimdahl** (Elo rating of 1007 after 29 encounters)
1. **J. Lindén** (Elo rating of 1001 after 23 encounters)
1. **D. Gustafson** (Elo rating of 996 after 6 encounters)
1. **L. Heinola** (Elo rating of 975 after 4 encounters)
1. **S. Stenroos** (Elo rating of 849 after 16 encounters)
</details>

### Shotgun Modified
### Shotgun Open
### Shotgun Standard
### Shotgun Standard Manual