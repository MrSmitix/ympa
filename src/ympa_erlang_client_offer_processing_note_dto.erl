-module(ympa_erlang_client_offer_processing_note_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_processing_note_dto/0]).

-type ympa_erlang_client_offer_processing_note_dto() ::
    #{ 'type' => ympa_erlang_client_offer_processing_note_type:ympa_erlang_client_offer_processing_note_type(),
       'payload' => binary()
     }.

encode(#{ 'type' := Type,
          'payload' := Payload
        }) ->
    #{ 'type' => Type,
       'payload' => Payload
     }.
