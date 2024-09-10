-module(ympa_erlang_client_get_campaigns_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_campaigns_response/0]).

-type ympa_erlang_client_get_campaigns_response() ::
    #{ 'campaigns' := list(),
       'pager' => ympa_erlang_client_flipping_pager_dto:ympa_erlang_client_flipping_pager_dto()
     }.

encode(#{ 'campaigns' := Campaigns,
          'pager' := Pager
        }) ->
    #{ 'campaigns' => Campaigns,
       'pager' => Pager
     }.
