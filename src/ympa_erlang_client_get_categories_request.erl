-module(ympa_erlang_client_get_categories_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_categories_request/0]).

-type ympa_erlang_client_get_categories_request() ::
    #{ 'language' => ympa_erlang_client_language_type:ympa_erlang_client_language_type()
     }.

encode(#{ 'language' := Language
        }) ->
    #{ 'language' => Language
     }.
