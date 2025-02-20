# pscore2elo

Match results are grabbed from the web and stored in JSON files.

Each match is divided into divisions and stages. Each stage is divided into separate encounters. Each encounter has a winner and a loser.

## Example

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

## 2024 season result
```
Loaded 19 handgun stages
Loaded 23 mini rifle stages
Loaded 14 PCC stages
Loaded 18 rifle stages

IPSC HANDGUN
- Classic: [Andersson Fredrik (947), Svensson Anders (1054)]
- Open: []
- Production: [Heinola Linda (727), Stjernlöf Tony (821), Degerth Frank (863), Welin Jan (914), Häggblom Nils (935), Jansson Philip (950), Norkvist Alexander (981), Häger Andreas (1022), Fyrqvist Jonas (1032), Heimdahl Patrik (1081), Welin Simon (1094), Nordqvist Tommy (1129), Pettersson Emil (1214), Lindén Jonas (1273)]
- Production Optics: [Back Daniela (854), Öberg Nicklas (919), Back Jonas (962), Welin Simon (999), Fyrqvist Jonas (1030), Pettersson Emil (1040), Lindholm John (1051), Bonn Tobias (1155)]
- Standard: [Heinola Linda (782), Granlund Brage (818), Sundblom Peter (819), Mörn Gustav (945), Nordqvist Tommy (953), Welin Jan (970), Eklund Dimi (1002), Berlin Tomas (1008), Pettersson Linus (1014), Norqvist Alexander (1065), Stenroos Samuel (1156), Heimdahl Patrik (1216), Mörn Tomas (1295)]

IPSC Mini Rifle
- Open: [Gustafson Dan (750), Granlund Brage (758), Norqvist Alexander (789), Heinola Linda (805), Dahlman Tobias (981), Back Daniela (1004), Sundblom Peter (1013), Andersson Fredrik (1014), Heimdahl Patrik (1018), Svensson Anders (1025), Granlund Nick (1092), Welin Jan (1102), Mörn Tomas (1103), Welin Simon (1218), Linden Jonas (1346)]
- Standard: []

IPSC PCC
- Iron: []
- Optics: [Gustafsson Benny (857), Svensson Anders (897), Heimdahl Patrik (897), Heinola Linda (924), Norkvist Alexander (938), Andersson Fredrik (944), Öberg Niclas (1040), Welin Simon (1042), Lindén Jonas (1075), Mörn Tomas (1118), Mörn Gustav (1289)]

IPSC Rifle
- Manual Action Bolt: []
- Manual Action Contemporary: []
- Semi-Auto Open: [Andersson Fredrik (552), Heinola Linda (571), Granlund Brage (716), Sundblom Peter (749), Jansson Philip (842), Grönqvist Jonathan (866), Granlund Nick (903), Fyrqvist Jonas (918), Svensson Anders (983), Grönkvist Jonathan (984), Häggblom Nils (987), Norqvist Alexander (1015), Back Jonas (1018), Back Daniela (1022), Linden Jonas (1048), Welin Jan (1080), Mörn Gustav (1091), Heimdahl Patrik (1122), Stenroos Samuel (1190), Häger Andreas (1231), Öberg Nicklas (1285), Mörn Tomas (1450), Welin Simon (1472)]
- Semi-Auto Standard: [Heinola Linda (976), Gustafson Dan (977), Heimdahl Patrik (1003), Cederberg Sebastian (1048)]

IPSC Shotgun
- Modified: []
- Open: []
- Standard: []
- Standard Manual: []

1-v-1 encounters: 2680

```
