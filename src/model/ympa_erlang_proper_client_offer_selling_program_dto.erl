-module(ympa_erlang_proper_client_offer_selling_program_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_offer_selling_program_dto/0]).

-export([ympa_erlang_proper_client_offer_selling_program_dto/1]).

-export_type([ympa_erlang_proper_client_offer_selling_program_dto/0]).

-type ympa_erlang_proper_client_offer_selling_program_dto() ::
  [ {'sellingProgram', ympa_erlang_proper_client_selling_program_type:ympa_erlang_proper_client_selling_program_type() }
  | {'status', ympa_erlang_proper_client_offer_selling_program_status_type:ympa_erlang_proper_client_offer_selling_program_status_type() }
  ].


ympa_erlang_proper_client_offer_selling_program_dto() ->
    ympa_erlang_proper_client_offer_selling_program_dto([]).

ympa_erlang_proper_client_offer_selling_program_dto(Fields) ->
  Default = [ {'sellingProgram', ympa_erlang_proper_client_selling_program_type:ympa_erlang_proper_client_selling_program_type() }
            , {'status', ympa_erlang_proper_client_offer_selling_program_status_type:ympa_erlang_proper_client_offer_selling_program_status_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

