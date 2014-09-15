grammar IPS;
@header {
package com.intertechitalia.ips2.core;
}
parse
: megablock EOF
;
megablock
: block+
;
block
: DO statement (','statement )*  END
| ifStatement
;

ifStatement
:  ifStat  elseStat?
;

ifStat
: (If|Per) expr  block
;

elseStat
: Else  block
;

statement
:functionCall
|assign
|saltaCall
|interrompiCall
;
functionCall
: funcCall
;
funcCall
: Println '(' expr? ')' #printlnFunctionCall
| Print '(' expr ')'    #printFunctionCall
| DurG1 '(' expr ')'    #durg1FunctionCall
| DurG2 '(' expr ')'    #durg2FunctionCall
| ValPa '(' expr ')'    #valpaFunctionCall
| ScaG2 '(' expr ')'    #scag2FunctionCall
| AggOr '(' exprList ')'    #aggorFunctionCall
| Giorno                #giorno1FunctionCall
| Mese                  #mese1FunctionCall
| ModOr                 #modorFunctionCall
| Effettive             #effettiveFunctionCall
;
saltaCall
:Salta '(' expr ')'
;
interrompiCall
: 'Interrompi'   #interrompiFunctionCall
;
exprList
: expr (',' expr)*
;
assign
:Identifier '=' expr
;


expr
:  expr 'Arr' '-' expr #modulusMinExpr
| expr 'Arr' '+' expr #modulusPlusExpr
|'-'expr   #unaryMinusExpr
| Giorno ('='|'==') Number #giornoNumExpr
| Giorno ('='|'==') Days #giornoDayExpr
| Giorno ('<>') Number #giornoNumNExpr
| Giorno ('<>') Days #giornoDayNExpr
| Mese ('='|'==') Number #meseoNumExpr
| Mese ('='|'==') Months #meseMonthsExpr
| Mese ('<>') Number #meseNumNExpr
| Mese ('<>') Months #meseMonthsNExpr
| '!'expr   #notExpr
| expr '^' expr #powerExpr
| expr '*' expr #multiplyExpr
| expr '/' expr #divideExpr

| expr '+' expr #addExpr
| expr '-' expr #subtractExpr
| expr '>=' expr #gtEqExpr
| expr '<=' expr #ltEqExpr
| expr '>' expr #gtExpr
| expr '<' expr #ltExpr
| expr '<>' expr #nEqExpr
| expr '==' expr #eqExpr
| expr 'O' expr #orExpr
| expr 'E' expr #andExpr
| expr '=' expr #eqExpr
| Number        #numberExpr
| Bool          #boolExpr
| Null          #nullExpr
| functionCall   #functionCallExpr
| Identifier    #identifierExpr
| String        #stringExpr
| '(' expr ')'  #exprExpr


;

AggOr:'AggOr';
ScaG2:'ScaG2';
Effettive:'Effettive';
ModOr:'ModOr';
Giorno:'Giorno';
Mese:'Mese';
ValPa:'ValPa';
DurG1:'DurG1';
DurG2:'DurG2';
DO:'Fai';
END:';';
Salta:'Salta';
Println:'ScriviACapo';
Print:'Scrivi';
If : 'Se';
Else : 'Oppure';
Null:'null';

Or : 'O';
And : 'E';
Equals : '==';
NEquals : '<>';
GTEquals : '>=';
LTEquals : '<=';
Pow : '^';
Excl : '!';
GT : '>';
LT : '<';
Add : '+';
Subtract : '-';
Multiply : '*';
Divide : '/';
Modulus : '%';
OBrace : '{';
CBrace : '}';
OBracket : '[';
CBracket : ']';
OParen : '(';
CParen : ')';
Assign : '=';
Colon : ':';
Per : 'Per';


Bool
: 'true'
| 'false'
;

Days
: ('Lun'|'Mar'|'Mer'|'Gio'|'Ven'|'Sab'|'Dom')
;
Months
:('Gen'|'Feb'|'Mar'|'Apr'|'Mag'|'Giu'|'Lug'|'Ago'|'Set'|'Ott'|'Nov'|'Dic')
;
Identifier
: [a-zA-Z_] [a-zA-Z_0-9]*
| [0-9]* [a-zA-Z_]+ ([a-zA-Z_0-9?]*)
| '0'+ [1-9]+ [0-9]*
;
Number
: Int ('.' Digit*)?
;


String
: ["] (~["\r\n] | '\\\\' | '\\"')* ["]
| ['] (~['\r\n] | '\\\\' | '\\\'')* [']
;



fragment Int
: [1-9] Digit*
| '0' Digit*
;
fragment Digit
: [0-9]
;
// ---------SKIP------------
Comment
: ('#' ~[\r\n]* ) -> skip
;
Space
: [ \t\r\n\u000C] -> skip
;