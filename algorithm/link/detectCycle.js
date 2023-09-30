import ListNode from "./ListNode";

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var detectCycle = function(head){
    if(head === null){
        return null;
    }
    let fast = head, slow = head;
    while(true){
        if(fast === null || fast.next === null){
            return null;
        }
        slow = slow.next;
        fast = fast.next.next;
        if(slow === fast){
            break;
        } 
    }
    let result = head;
    while(result !== slow){
        slow = slow.next;
        result = result.next;
    }
    return result;
    
}