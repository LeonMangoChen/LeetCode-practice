/**
 * @param {string[]} strs
 * @return {string}
 */
 
// 编写一个函数来查找字符串数组中的最长公共前缀。
// 如果不存在公共前缀，返回空字符串 ""。
 
var longestCommonPrefix = function(strs) {
    var firstStr = strs[0],result = '';
    if(!strs.length){
        return result;
    }
    for(var i = 0;i < firstStr.length;i++){
        for(var j = 1;j < strs.length;j++){
            if(firstStr[i] !== strs[j][i]){
                return result;
            }
        }
        result += firstStr[i];
    }
    return result;
};
