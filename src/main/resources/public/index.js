function makeMove(field) { 
    $.get('/makeMove/'+field, { 'field': field }, 
        function(data) { 
            if(data.length == 1) { 
                $('#'+field).html(data); 
                isTie(); 
            } 
            else { 
				if(data.indexOf('x') != -1) { 
					$('#'+field).html('x'); 
				} else if(data.indexOf('o') != -1) { 
					$('#'+field).html('o'); 
				} 

				$('#message_prompt').html(data); 
			} 
		}); 
} 

function newGame() { 
	$.get('/newGame/', function(data) { 
		var counter = 0; 
		var string = 'TICTACTOE'
		$('#message_prompt').html(''); 
		
		$('button').each(function() { 
			if($(this).attr('id') != 'new_game') { 
				$(this).html(string[counter]); counter++; } 
			}); 
	}); 
} 

function isTie() { 
	var tie = true; 
	$('button').each(function() { 
		if($(this).html() != 'x' && $(this).html() != 'o' && $(this).attr('id') != 'new_game') { 
			tie = false; 
		} 
	}); 

	if(tie) { 
		$('#message_prompt').html('Wow, we have a tie game!');
	} 
}