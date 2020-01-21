grammar calcul;

@parser::members {
    private int res;
    public  int exec() throws Exception {
        program();
        return res;
    }
}

program : expression '$$'{
    res = $expression.val;
};


expression returns [int val] : x = INT o = op expression
 {
 $o.String == '+' ? $val=$x.int + $expression.val : $val=$x.int - $expression.val;
 }
 |
 INT { $val = $INT.int;};



op : '+' | '-' ;

INT:[0-9]+;
WS : [ \r\t\n]+ -> skip;
