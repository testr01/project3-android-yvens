package com.example.projet4_android_defi30jours.data

import com.example.projet4_android_defi30jours.R


val challengeTitles = listOf(
    "Affrontez l’adversité avec calme ",
    "Construisez patiemment votre empire ",
    "Maintenez votre dignité même dans l'échec",
    "Transformez vos échecs en opportunités",
    "Restez fidèle à vos convictions",
    "Créez des solutions quand tout semble bloqué",
    "Ne vous reposez jamais sur vos lauriers",
    "Transformez la critique en force motrice",
    "Soyez inflexible dans vos objectifs",
    "Agissez sur les petits détails pour de grands résultats",
    "Maîtrisez vos impulsions",
    "Pratiquez la patience stratégique",
    "Créez des rituels de discipline",
    "Fixez des limites et restez concentré",
    "Gardez vos plans pour vous-même",
    "Le silence est un atout stratégique",
    "Utilisez l'écoute pour comprendre vos adversaires",
    "Se taire est parfois un acte de pouvoir",
    "Posez des questions et écoutez attentivement",
    "Apprenez à vous retirer en silence",
    "Observez tout, ne ratez rien",
    "Les petits détails révèlent de grandes intentions",
    "Soyez présent mais discret",
    "Étudiez les actions, pas les paroles",
    "Prenez mentalement des notes invisibles",
    "Testez la loyauté avant de donner votre confiance",
    "Surveillez même vos alliés",
    "Ne vous fiez jamais aux apparences",
    "Les promesses ne valent rien sans preuve",
    "Réévaluez constamment vos alliances"
)


val challengeDescriptions = listOf(
    "Ne jamais fuir devant l’adversité, comme un parrain mafieux",
    "Le pouvoir se construit brique par brique, à la manière d’un politicien.",
    "Ne perdez jamais la face, même dans la défaite, comme un aristocrate.",
    "Chaque échec est une victoire masquée, selon la logique d’un homme d’affaires.",
    "N'abandonnez jamais vos convictions, c’est le vrai courage.",
    "S'il y a une porte fermée, créez une clé, comme un mafieux rusé.",
    "Ne vous reposez jamais sur vos acquis, tel un aristocrate en quête perpétuelle de grandeur.",
    "Transformez chaque doute en motivation, à l'image d’un politicien affûté.",
    "Soyez inflexible dans vos objectifs, mais flexible dans vos méthodes, l’art de la négociation réussie.",
    "Voyez grand, agissez petit, la clé de la réussite des hommes d’affaires.",
    "Contrôlez vos impulsions, comme un parrain qui ne se laisse jamais emporter par l’émotion.",
    "Maîtrisez l’art de la patience, à l'image d’un politicien qui joue sur le long terme.",
    "Créez des rituels de discipline quotidienne, comme un aristocrate perfectionniste.",
    "Fixez des limites, l'arme secrète des hommes d’affaires concentrés.",
    "Gardez vos plans pour vous, la discipline d’un mafieux calculateur.",
    "Le silence est une arme, la philosophie du mafieux silencieux.",
    "Observez les faiblesses de vos adversaires, comme un politicien avisé.",
    "Les grands seigneurs savent quand se taire, l’art aristocratique de l’écoute.",
    "Posez des questions simples, écoutez des réponses complexes, une méthode d’affaires redoutablement efficace.",
    "Maîtrisez l’art du silence stratégique, savoir quand ne rien dire renforce votre autorité.",
    "L'observation est votre meilleur allié, comme un parrain qui surveille chaque détail.",
    "Les détails révèlent les intentions, la règle d’or d’un politicien observateur.",
    "Soyez l’ombre dans la lumière des autres, tel un aristocrate qui observe sans se dévoiler.",
    "Étudiez les comportements, la devise d’un homme d’affaires qui juge sur les actes.",
    "Prenez des notes invisibles, en tant qu’observateur, rien ne doit vous échapper.",
    "La confiance se gagne à travers l’épreuve, comme un mafieux méfiant.",
    "Même vos alliés doivent être surveillés, la prudence politique à son paroxysme.",
    "La méfiance est une forme d’intelligence, une leçon d’aristocratie.",
    "Ne vous laissez jamais aveugler par les promesses, l’homme d’affaires attend des résultats, pas des mots.",
    "Révisez constamment vos alliances, comme un parrain qui ajuste ses partenariats selon l’intérêt du moment."
)


val challengeImages = listOf(
    R.drawable.pic_businessmeeting,
    R.drawable.pic_black_fellas_laughing,
    R.drawable.pic_determination,
    R.drawable.pic_confident,
    R.drawable.pic_relax_cigar,
    R.drawable.pic_moneymaker,
    R.drawable.pic_goalfinder,
    R.drawable.pic_team,
    R.drawable.pic_idea_maker,
    R.drawable.pic_thinker,
    R.drawable.pic_pilot_plane,
    R.drawable.pic_parachute,
    R.drawable.pic_signed_doc,
    R.drawable.pic_partners_talking,
    R.drawable.pic_visionary,
    R.drawable.pic_thinker2,
    R.drawable.pic_richman,
    R.drawable.pic_pilot_helicopter,
    R.drawable.pic_in_mansion,
    R.drawable.pic_meeting,
    R.drawable.pic_takephoto,
    R.drawable.pic_thinker3,
    R.drawable.pic_relax_cigar,
    R.drawable.pic_black_fellas_laughing,
    R.drawable.pic_businessmeeting,
    R.drawable.pic_determination,
    R.drawable.pic_moneymaker,
    R.drawable.pic_confident,
    R.drawable.pic_thinker,
    R.drawable.pic_goalfinder
)


val sampleDays = List(30) { index ->
    ChallengeDay(
        id = index + 1,
        number = index + 1,
        date = "2024-10-${index + 1}",
        title = challengeTitles.getOrElse(index) { "Défi par défaut" },
        imageRes = challengeImages.getOrElse(index) { R.drawable.ic_launcher_foreground },
        description = challengeDescriptions.getOrElse(index) { "Description par défaut" },
        isCompleted = false
    )
}
