-module(ympa_erlang_client_feedback_author_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feedback_author_dto/0]).

-type ympa_erlang_client_feedback_author_dto() ::
    #{ 'name' => binary(),
       'region' => ympa_erlang_client_region_dto:ympa_erlang_client_region_dto()
     }.

encode(#{ 'name' := Name,
          'region' := Region
        }) ->
    #{ 'name' => Name,
       'region' => Region
     }.
