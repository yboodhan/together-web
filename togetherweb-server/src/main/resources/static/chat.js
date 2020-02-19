// On loading of the page, execute the following:

$(function() {
    'use strict';

    // Initially, the client is null
    var client = null;

    // Initially, fields are set to disabled/unconnected
    $('#connect,#disconnect,#text').prop('disabled', true);

    // Initially, the message field is blank
    $('#text').val("");

    // On form submission, prevent page refresh
    $("form").on('submit', function (e) {
        e.preventDefault();
    });

    // Add message to display
    function showMessage(msg) {
        $('#messages').append(
            '<div>' +
            '<p>' +
                msg.time + ' | ' + msg.author + ' said: ' + msg.content +
            '</p>' +
            '</div>');
    }




});