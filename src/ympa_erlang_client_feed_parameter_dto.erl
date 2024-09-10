-module(ympa_erlang_client_feed_parameter_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feed_parameter_dto/0]).

-type ympa_erlang_client_feed_parameter_dto() ::
    #{ 'deleted' => boolean(),
       'name' := binary(),
       'values' => list()
     }.

encode(#{ 'deleted' := Deleted,
          'name' := Name,
          'values' := Values
        }) ->
    #{ 'deleted' => Deleted,
       'name' => Name,
       'values' => Values
     }.
