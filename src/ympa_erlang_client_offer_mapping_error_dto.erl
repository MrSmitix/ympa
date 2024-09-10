-module(ympa_erlang_client_offer_mapping_error_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_mapping_error_dto/0]).

-type ympa_erlang_client_offer_mapping_error_dto() ::
    #{ 'type' := ympa_erlang_client_offer_mapping_error_type:ympa_erlang_client_offer_mapping_error_type(),
       'parameterId' => integer(),
       'message' := binary()
     }.

encode(#{ 'type' := Type,
          'parameterId' := ParameterId,
          'message' := Message
        }) ->
    #{ 'type' => Type,
       'parameterId' => ParameterId,
       'message' => Message
     }.
