/**
 * @param {string} s
 * @return {number}
 */

// 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

var lengthOfLongestSubstring = function(s) {
	var res = 0;
	var str = '';
    for(var i = 0;i < s.length;i++){
 		var specStr = s.charAt(i);
    	var index = str.indexOf(specStr);
    	if(index === -1){
    		str = str + specStr;
    		res = res < str.length ? str.length : res;
    	} else {
    		str = str.substr(index + 1) + specStr;
    		console.log(str);
    	}
    }
    // console.log(res,str)
    return(res);
};

lengthOfLongestSubstring('abdvadhkmwq');