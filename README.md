# ÅSSF IPSC ELO ratings

Match results are grabbed from the web and stored in JSON files.

Each match is divided into divisions and stages. Each stage is divided into separate encounters. Each encounter has a winner and a loser. Hit factor is disregarded except for determining a winner and a loser.

Shooters start with an ELO rank of 1000.

## Example
<details>
<summary>Hidden</summary>

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

This also means that a DQ has an enormous effect. Given a match with 10 shooters and 5 stages a DQ will result in (9 opponents * 5 stages) = 45 individual losses for the affected shooter.

</details>

## Ranking
```
Loaded 50 handgun stages
Loaded 30 mini_rifle stages
Loaded 34 pcc stages
Loaded 28 rifle stages
Loaded 0 shotgun stages

Handgun Classic             [F. Andersson (935), A. Svensson (1066)]
Handgun Open                [T. Nordqvist (955), T. Mörn (1046)]
Handgun Production          [D. Back (690), S. Stenroos (746), L. Heinola (755), M. Nilsson (779), P. Jansson (801), P. Sundblom (829), T. Stjernlöf (833), M. Stenroos (867), F. Degerth (890), F. Andersson (929), D. Gustafsson (931), A. Svensson (938), L. Pettersson (939), N. Häggblom (939), J. Welin (957), T. Mörn (967), A. Norkvist (1010), D. Källroos (1013), J. Fyrqvist (1025), A. Häger (1034), S. Welin (1111), J. Back (1125), G. Mörn (1176), P. Heimdahl (1179), N. Granlund (1217), T. Nordqvist (1257), J. Lindén (1328), E. Pettersson (1349), J. Lindholm (1461)]
Handgun Production Optics   [D. Back (842), N. Öberg (857), T. Dahlman (934), J. Back (958), S. Welin (981), E. Pettersson (1085), J. Lindholm (1139), T. Bonn (1209)]
Handgun Standard            [L. Heinola (767), P. Jansson (798), B. Granlund (803), P. Sundblom (807), R. Eriksson (894), T. Nordqvist (931), G. Mörn (939), J. Welin (956), D. Eklund (985), A. Rothberg (996), L. Pettersson (1000), T. Berlin (1003), A. Norqvist (1059), S. Stenroos (1077), N. Öberg (1092), T. Bonn (1132), D. Källroos (1184), J. Lindén (1200), P. Heimdahl (1202), T. Mörn (1206)]
Mini Rifle Open             [B. Granlund (660), D. Gustafson (763), A. Norqvist (786), L. Heinola (804), T. Dahlman (923), D. Back (960), F. Andersson (1015), A. Svensson (1017), P. Heimdahl (1018), P. Sundblom (1024), N. Granlund (1084), T. Mörn (1092), J. Welin (1099), S. Welin (1220), J. Lindén (1224), J. Linden (1344)]
Mini Rifle Standard         []
PCC Iron                    []
PCC Optics                  [N. Häggblom (791), B. Gustafsson (820), A. Svensson (822), L. Heinola (853), P. Jansson (877), A. Norkvist (900), F. Andersson (909), P. Heimdahl (935), N. Öberg (990), S. Welin (1006), J. Lindblom (1011), E. Pettersson (1118), D. Källroos (1128), T. Mörn (1169), T. Bonn (1212), J. Lindén (1235), G. Mörn (1259)]
Rifle Manual Action Bolt    []
Rifle Manual Action Contemporary[]
Rifle Semi Auto Open        [F. Andersson (664), P. Sundblom (665), P. Jansson (752), B. Granlund (817), G. Gottberg (852), J. Grönqvist (888), N. Granlund (889), N. Häggblom (905), A. Norqvist (941), D. Back (959), J. Fyrqvist (974), J. Back (977), A. Svensson (979), J. Linden (1002), J. Welin (1021), T. Bonn (1030), G. Mörn (1056), P. Heimdahl (1074), S. Stenroos (1178), A. Häger (1179), J. Lindholm (1184), N. Öberg (1218), T. Mörn (1415), S. Welin (1431)]
Rifle Semi Auto Standard    [S. Stenroos (887), L. Heinola (982), P. Heimdahl (987), J. Linden (992), D. Gustafson (996), J. Lindén (1030), S. Cederberg (1130)]
Shotgun Modified            []
Shotgun Open                []
Shotgun Standard            []
Shotgun Standard Manual     []

1v1 encounters: 4163
1v1 ignored encounters (shared last place at HF 0): 64
```
