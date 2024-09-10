-module(ympa_erlang_client_feedback_factor_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feedback_factor_dto/0]).

-type ympa_erlang_client_feedback_factor_dto() ::
    #{ 'id' => integer(),
       'title' => binary(),
       'description' => binary(),
       'value' => integer()
     }.

encode(#{ 'id' := Id,
          'title' := Title,
          'description' := Description,
          'value' := Value
        }) ->
    #{ 'id' => Id,
       'title' => Title,
       'description' => Description,
       'value' => Value
     }.
