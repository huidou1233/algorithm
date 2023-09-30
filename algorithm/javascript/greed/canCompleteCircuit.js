var canCompleteCircuit = function(gas, cost) {
    let l = gas.length;
    let run = 0, rest = 0;
    let start = 0;
    for(let i = 0; i < l; ++i){
        run += gas[i] - cost[i]
        rest += gas[i] - cost[i];
        if(run < 0){
            run = 0;
            start = i + 1;
        }
    }
    return rest < 0 ? -1 : start;
};