/*pub-1|2013-09-18 10:43:11*/(function(){var s=Math.random();if(s>0.1){return}var n=1;var j="tb_index_tracer";var c=window;var w=document;var o=0;var a=500;var m=0;var h=1;var q=-1;var v=document.documentElement.clientHeight;var k=60*5*1000;var u=true;var t=null;var f="1.1000386";var d="1.6659421";var b="1.6659429";function l(){if(!c.goldlog&&o<a){o++;setTimeout(arguments.callee,200);return}var e=goldlog.spm_ab.join(".");if(e==f){t="http://ac.mmstat.com/tbindex.3.1?logtype=4"}else{if(e==d){t="http://ac.mmstat.com/tbindex.3.2?logtype=4"}}goldlog.on(c,"scroll",function(){if(q==-1){q=(new Date())-g_config.startDate;goldlog.emit(j,{type:"scroll_wait",t:q,_r:s})}g()});goldlog.DOMReady(function(){if(c.g_config&&g_config.startDate){goldlog.emit(j,{type:"load",t:((new Date())-g_config.startDate),_r:s})}});if(s<0.01){var x=w.createElement("script");x.type="text/javascript";x.async=true;x.src="http://a.tbcdn.cn/s/fdc/xwj.js?v=130605a";w.getElementsByTagName("head")[0].appendChild(x);function y(){var z;switch(e){case f:z="130912-206";break;case d:z="130601-1";break;case b:z="130912-207"}if(c._ap_xwj){if(z){_ap_xwj.monitor(z)}}else{setTimeout(y,500)}}y()}goldlog.on(c,"beforeunload",function(){if(u){r()}});goldlog.emit(j,{type:"pv",v:n,ua:c.navigator?navigator.userAgent:"N/A",_r:s});setTimeout(function(){r();u=false},k)}function r(){try{if(t){goldlog.send(t,{screen:h,y:m,cache:i()})}goldlog.emit(j,{type:"unload",scroll:m,vh:v,_r:s})}catch(x){}}function g(){var e=w.body.scrollTop;m=e>m?e:m;h=Math.ceil(m/v)+1}function i(){return Math.floor(Math.random()*268435456).toString(16)}try{l()}catch(p){}})();