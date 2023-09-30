/**
 * @param {number[]} ratings
 * @return {number}
 */
var candy = function(ratings) {
    let l = ratings.length;
    if(ratings.length < 2){
        return l
    }
    let candy = Array(ratings.length).fill(1)
    
    for(i = 1; i < l; i++){
        if(ratings[i] > ratings[i - 1]){
            candy[i] = candy[i - 1] + 1;
        }
    }
    for(i = l - 1; i >= 1; i--){
        if(ratings[i] < ratings[i - 1] && candy[i] >= candy[i - 1]){
            candy[i - 1] =  candy[i] + 1
        }
    }
    let result = 0;
    candy.forEach(i => {
        result += i;
    })
    return result
};