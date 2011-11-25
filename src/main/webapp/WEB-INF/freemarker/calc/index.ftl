<script>


var samsung_do = function (price) {

	//var price_buy = $('#price_buy').val();
	//var price_sell = $('#price_sell').val();
	
	var fee, fee_extra = 0 ; 
	
	if ( price < 500000 ) {
		fee = 0.4936;
	} else if ( price >= 500000 && price < 10000000 ) {
		fee = 0.1436;
		fee_extra = 1500;	
	} else if ( price >= 10000000 && price < 50000000 ) {
		fee = 0.1236;
		fee_extra = 3000;
	} else if ( price >= 50000000 && price < 100000000 ) {
		fee = 0.1136;
	} else if ( price >= 100000000 && price < 300000000 ) {
		fee = 0.0936;
	} else if ( price >= 300000000 ) {
		fee = 0.0736;
	}

	//$('#fee').val(fee);
	//$('#fee_extra').val(fee_extra);
	
	return [fee, fee_extra];

};



$(function() {
	
	$('#doCalc').click(function() {
	
		var funcName = eval($('#sel_sta').val() + "_do");

		var buy = funcName($('#price_buy').val() * $('#amt').val());
		
		alert(buy);

		$('#fee_buy').val(buy[0]);
		$('#fee_buy_extra').val(buy[1]);

		var sell = funcName($('#price_sell').val() * $('#amt').val());
		
		$('#fee_sell').val(sell[0]);
		$('#fee_sell_extra').val(sell[1]);
		
		$('#tp_buy').val($('#price_buy').val() * $('#amt').val());
		$('#tp_sell').val($('#price_sell').val() * $('#amt').val());
	
		$('#charge_buy').val(Math.round($('#tp_buy').val() * ($('#fee_buy').val()/100) + parseInt($('#fee_buy_extra').val())));
		$('#charge_sell').val(Math.round($('#tp_sell').val() * ($('#fee_sell').val()/100) + parseInt($('#fee_sell_extra').val())));
		$('#tax_sell').val($('#tp_buy').val() * ($('#tax').val()/100));
		
		
		
	});

});

</script>

증권사 선택 : 
<select id="sel_sta">
<option value="samsung">삼성증권</option>
</select>
<br/>


매수단가 : <input type="text" id="price_buy" name="price_buy" /><br/>
매도단가 : <input type="text" id="price_sell" name="price_sell" /><br/>
수량 : <input type="text" id="amt" name="amt" /><br/>

매수 수수료율 : <input type="text" id="fee_buy" name="fee_buy" /> + <input type="text" id="fee_buy_extra" name="fee_buy_extra" /><br/>
매도 수수료율 : <input type="text" id="fee_sell" name="fee_sell" /> + <input type="text" id="fee_sell_extra" name="fee_sell_extra" /><br/>

매도 세 : <input type="text" id="tax" name="tax" value="0.3"/> <br/>

<input type="button" value="계산" id="doCalc" />

<p>
매수가 : <input id="tp_buy" />
매수 수수료 : <input id="charge_buy" /><br/>
매수총액 : <input id="amt_buy" /><br/><br/>


매도가 : <input id="tp_sell" />
매도 수수료 : <input id="charge_sell" />  매도 세 : <input id="tax_sell" /><br/>
매도총액 : <input id="amt_sell" /><br/><br/>

차익 : <input id="amt_total" />






</p>


