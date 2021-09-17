package com.example.intech

object NewsData {
    private val newsPicture = intArrayOf(
        R.drawable.news_1,
        R.drawable.news_2,
        R.drawable.news_3,
        R.drawable.news_4,
        R.drawable.news_5,
        R.drawable.news_6,
        R.drawable.news_7,
        R.drawable.news_8,
        R.drawable.news_9,
        R.drawable.news_10
    )

    private val newsTitle = arrayOf(
        "Apple’s next big technology was absent at the iPhone 13 launch, but Tim Cook says he’s still a fan",
        "Thomas Kurian shows he’s not afraid to bench long-timers at Google Cloud as he pursues growth",
        "Canva: Australian online design platform valued at \$40bn",
        "Microsoft makes top lawyer Brad Smith its vice chair",
        "Microsoft acquires learning marketplace start-up TakeLessons",
        "Chinese Tesla rival XPeng plans new vehicles and targets a distant future in robots and flying cars",
        "Bitcoin tumbles nearly 10% as El Salvador adopts it as legal tender",
        "Warren Buffett-backed electric carmaker BYD sees August sales surge more than 300%",
        "Elon Musk says Tesla Roadster delayed until 2023 as supply chain issues persist",
        "The U.S. added more new energy capacity from wind than any other source last year"
    )

    private val newsDateAuthor = arrayOf(
        "Thu, 16 Sep 2021 - Kif Leswing (cnbc.com)",
        "Thu, 16 Sep 2021 - Jennifer Elias (cnbc.com)",
        "Wed, 15 Sep 2021 - BBC News",
        "Tue, 14 Sep 2021 - Jordan Novet (cnbc.com)",
        "Fri, 10 Sep 2021 - Jordan Novet (cnbc.com)",
        "Wed, 8 Sep 2021 - Arjun Kharpal (cnbc.com)",
        "Tue, 7 Sep 2021 - Tanaya Macheel (cnbc.com)",
        "Mon, 6 Sep 2021 - Arjun Kharpal (cnbc.com)",
        "Wed, 1 Sep 2021 - Lora Kolodny (cnbc.com)",
        "Tue, 31 Aug 2021 - Lora Kolodny (cnbc.com)"
    )

    private val newsIsFavorite = booleanArrayOf(
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false,
        false
    )

    private val newsDescription = arrayOf(
        "At Apple’s annual launch event this week, it revealed new iPhones, iPads and Apple Watches, all of which were refinements of previous models.\n" +
                "\n" +
                "What Apple didn’t release, however, was a new kind of product — Apple’s “next big thing” which customers hope will be extremely cool and investors hope will drive another decade or more of Apple growth, like the iPhone did before it.\n" +
                "\n" +
                "In previous years, Apple and its CEO, Tim Cook, have emphasized “augmented reality,” or AR, which is a term for a collection of technologies that use advanced cameras and modern chips to be able to understand where objects are in relation to the user and place computer graphics or information over a screen showing the real world.\n" +
                "\n" +
                "Eventually, believers like Facebook’s Mark Zuckerberg say augmented reality technologies will be bundled into a headset or glasses, which could represent a sea change for the technology industry like how the original iPhone’s touchscreen created billion-dollar companies.\n" +
                "\n" +
                "But at Tuesday’s event, augmented reality technology didn’t make an appearance, except for a brief mention of one AR app that runs on iPads.\n" +
                "\n" +
                "Justine Ezarik, who goes by iJustine on her popular YouTube page, brought up the lack of AR at the launch in a video interview with Cook posted after the event.\n" +
                "\n" +
                "In his answer, Cook repeated some of the things he’s said about AR in the past, but continued to be very bullish on the technology, calling himself “AR fan No. 1.”\n" +
                "\n" +
                "“I think AR is one of these very few profound technologies that we will look back on one day and went, how did we live our lives without it?” Cook said.\n" +
                "\n" +
                "Cook said that the main uses for AR technology include education, collaboration and shopping for furniture while making sure it fits in the user’s home.\n" +
                "\n" +
                "“And that’s at the early innings of AR,” Cook said. “It will only get better.”\n" +
                "\n" +
                "Competitors releasing glasses\n" +
                "\n" +
                "AR backers say that wearing computer glasses will be a normal, everyday experience, like using a smartphone is today.\n" +
                "\n" +
                "Apple has never confirmed it is building AR headsets, despite buying several start-ups working on key building blocks like transparent screens built into lenses and hiring hundreds of employees to work in its Technology Development Group on the project.\n" +
                "\n" +
                "Some of Apple’s closest competitors have already released headsets.\n" +
                "\n" +
                "Facebook released camera-equipped Ray-Ban sunglasses this week, which the company says are a precursor to more advanced products. Microsoft has been developing a high-end headset called Hololens and has a contract with the U.S. military potentially worth billions of dollars. Google kicked off the Silicon Valley obsession with computer glasses when it released Google Glass in 2013.\n" +
                "\n" +
                "The lack of AR announcements at Apple’s event is not a hint that Apple has given up on the technology. Apple’s launch events are focused on hardware and products customers can buy now — not providing clues about releases in upcoming years.\n" +
                "\n" +
                "None of Apple’s new devices got AR hardware, unlike in the past few years, when some models added lidar sensors that can measure how far away an object is. The new iPhone Pro’s cameras do have improved night mode, which could be a useful feature for headsets in low light.\n" +
                "\n" +
                "So far, in public, Apple has generally treated AR as a software feature. It built tools called ARKit and RealityKit for app developers to make their own iPhone AR apps without doing hard physics like triangulating the location of the user or detecting hands and faces.\n" +
                "\n" +
                "Those tools did make an appearance before Apple’s event. Users with AR-capable iPhones could download a file from Apple’s website that created a portal to a California landscape, which was the theme of Apple’s launch.\n" +
                "\n" +
                "The iPhone software launching on Monday, iOS 15, includes a mode where Apple Maps overlays walking directions onto the real world — big arrows telling the user where to go, on the iPhone’s screen — in a preview of what could be a major feature for a headset.\n" +
                "\n" +
                "One challenge about these technologies is what to call them. Some people in the industry prefer the term “mixed reality,” which is less technical sounding. The CEOs of Microsoft and Facebook, which are perhaps the most enthusiastic big companies about augmented reality, have started to talk about a “metaverse,” or a digital world overlaid on top of the real world.\n" +
                "\n" +
                "Cook and Apple, for now, are sticking with “augmented reality.”\n" +
                "\n" +
                "“There’s clearly different words out there. I’ll stay away from the buzzwords and for the moment just call it augmented reality,” Cook said in an interview with Time published this week.\n",
        "As a part of a recent reorganization within Google Cloud, CEO Thomas Kurian sidelined multiple tenured company veterans -- one way he’s is living up to the company’s big expectations when it hired him two years ago.\n" +
                "\n" +
                "CNBC reported Wednesday that Kurian, in a recent email to staff, announced a broad reorganization within Google Cloud’s engineering units. The shakeup is meant to help Google Cloud continue to grow its market share while streamlining an organization that has ballooned since Kurian took over. The technical unit alone has doubled since he joined, Kurian said in his recent email.\n" +
                "\n" +
                "Google still lags behind Amazon and Microsoft in market share, but the recent reorganization and steady gains show why Kurian, an initially unlikely candidate, is doing what Google had hoped.\n" +
                "\n" +
                "In the latest re-org, Kurian sidelined several veterans who otherwise may have stayed on board thanks to their tenure. There’s a joke among Google employees that longtime middle managers and executives can sit comfortably in their positions for as long as they want despite changing business needs, thanks to the cultural bureaucracy. But in this latest move, Kurian showed he isn’t afraid to bench veterans and give others more responsibility.\n" +
                "\n" +
                "Kurian removed Eyal Manor, who has been at the company more than 14 years and worked within Cloud for five years. Manor oversaw the app management service Anthos, which Google hopes will give it an edge against rivals. Manor will look for other areas inside the company to work, Kurian said. Google spokesperson Jacinda Mein said that Manor chose to leave the group, and that the timing coincided with this reorg.\n" +
                "\n" +
                "The reorg also effectively sidelines Urs Holzle, who was one of Google’s first ten employees and first vice president of engineering, removing him from some of his day-to-day responsibilities in favor of a more strategic role. Holzle recently faced backlash from employees for contradicting his own remote work policies, too.\n" +
                "\n" +
                "Kurian also moved to unify Google Cloud’s technical teams under Brad Calder, who will take on some of Manor’s and Holzle’s responsibilities and report directly to Kurian. Calder spent eight years at Microsoft before joining Google Cloud in 2015.\n" +
                "\n" +
                "Sundar Pichai, chief executive officer at Google LLC, speaks during the Google Cloud Next '19 event in San Francisco, California, U.S., on Tuesday, April 9, 2019.\n" +
                "Sundar Pichai, chief executive officer at Google LLC, speaks during the Google Cloud Next ’19 event in San Francisco, California, U.S., on Tuesday, April 9, 2019.\n" +
                "Michael Short | Bloomberg | Getty Images\n" +
                "Growth trumps culture, for now\n" +
                "While Google Cloud still isn’t profitable, Kurian has more than doubled revenue and slashed losses from when he first joined the company, earning praise from Alphabet CEO Sundar Pichai, CFO Ruth Porat and investors.\n" +
                "\n" +
                "In the most recent quarter, cloud revenue grew to \$4.63 billion, up nearly 54% from \$3.01 billion a year ago. The cloud business had operating losses of \$591 million, a dramatic 58.7% improvement from last year’s loss of \$1.43 billion.\n" +
                "\n" +
                "Kurian has also put a strong focus on the company’s sales organization. Prior to Kurian, 10 managers would have to provide approval before a salesperson could offer a discount to a customer, and the deal would then require non-disclosure agreements and a team of lawyers. Kurian streamlined some of those practices early on.\n" +
                "\n" +
                "He has also encouraged the sales teams to incorporate other Google products, such as artificial intelligence tools and the Android mobile operating system, into their pitches in attempts to compete for more customers, especially more noteworthy ones. Kurian also reportedly boosted salespeople’s salaries to be more competitive than Amazon and Microsoft. \n" +
                "\n" +
                "Kurian had a reputation for a no-frills, at-times militant leadership style at Oracle. When Google hired him in 2018, it came as a shock because he was the least “Google-y” person to be a leader at the company, where employees largely felt they had a voice and everything was working toward a greater good.\n" +
                "\n" +
                "Culturally, Kurian is still trying to figure out how to navigate that longstanding justice-motivated employee culture, but he isn’t completely writing it off, as some internally expected. Most recently, he claimed to seek information from the U.S. Customs and Border Patrol about how the company’s artificial intelligence cloud tools would be used amid employee concern. While, there’s still a contingent of employees upset with the prospects, Kurian hasn’t completely written those concerns off yet.\n" +
                "\n" +
                "But culture fit is not why Google hired him. They knew his reputation. Google’s culture more generally had already begun moving toward a culture that no longer shied away from military contracts or used slogans like “Don’t Be Evil.”\n" +
                "\n" +
                "Whether or not Kurian’s process works in the long run, growth is what Google wants and growth is what what it’s getting — for now, at least.\n",
        "Australian graphic design business Canva has become one of the world's biggest privately-owned companies after being valued at \$40bn (£29bn).\n" +
                "\n" +
                "The online design platform said it had grown during the pandemic as more customers worked from home.\n" +
                "\n" +
                "It has revealed a fresh \$200m round of private equity investment - more than doubling the company's value in five months.\n" +
                "\n" +
                "That makes it one of the world's most valuable start-ups, analysts say.\n" +
                "\n" +
                "According to business data provider CB Insights, Canva's \$40bn valuation makes it the fifth-most valuable start-up in the world, behind China's ByteDance, which owns TikTok, payment platform Stripe, Elon Musk's rocket company SpaceX and Swedish financial technology firm Klarna.\n" +
                "\n" +
                "The funding also places its co-founders among the top 10 richest people in Australia.\n" +
                "\n" +
                "Canva was founded in Sydney in 2013 by Australians Melanie Perkins, 34, and Cliff Obrecht, 35.\n" +
                "\n" +
                "The 30-year-old woman who designed Canva in university\n" +
                "Together they own about 36% of the company, according to Forbes.\n" +
                "\n" +
                "On Wednesday, they announced that they also intended to give away the vast majority of the stake - about 30% of the company's wealth - to charitable causes.\n" +
                "\n" +
                "Canva provides design templates for people to make everything from greetings cards to posters, resumes and calendars.\n" +
                "\n" +
                "Also on Wednesday, the firm said it had grown its customer base to over 60 million users in 190 countries, and was on track to post \$1bn revenue by the end of the year.\n" +
                "\n" +
                "It said it had 500,000 paying customers, among them corporate clients like Zoom, Salesforce, Paypal, Marriott International and American Airlines, which the firm said had all increased their use of Canva's design technology in the past year.\n" +
                "\n" +
                "\"From large enterprises to small businesses, the shift to distributed working has seen team adoption more than quadruple over the last 12 months,\" the company said in a press release, referring to the number of companies taking up its software.\n" +
                "\n" +
                "media captionCanva chief executive Melanie Perkins spoke with the BBC in 2018\n" +
                "Its latest fund-raising round was led by global investment firm T.Rowe Price and investors included Franklin Templeton, Sequoia Capital Global Equities, Bessemer Venture Partners, Greenoaks Capital, Dragoneer Investments, Blackbird, Felicis, and AirTree Ventures.\n" +
                "\n" +
                "The firm has also doubled its workforce this year, hiring more than 1,000 new employees in 2021, with headquarters in Sydney and Manila.\n" +
                "\n" +
                "Canva, which became profitable in 2017 and achieved a \$1bn valuation a year later, is now one of Australia's most valuable companies.\n" +
                "\n" +
                "Its valuation puts it on par with publicly-listed firms such as supermarket giants Wesfarmers and Woolworths Group and mining company Fortescue.\n",
        "Microsoft said Tuesday its board approved the appointment of its president, Brad Smith, to the position of vice chair. The move comes months after Satya Nadella took on the role of chairman after joining the board when he replaced Steve Ballmer as CEO in 2014.\n" +
                "\n" +
                "The appointment follows a quarter of a century of contributions to the software and hardware maker, including dealing with antitrust concerns from regulators.\n" +
                "\n" +
                "“This reflects the unique leadership role that Brad plays for the company, our board of directors and me, with governments and other external stakeholders around the world,” Nadella was quoted as saying in a statement.\n" +
                "\n" +
                "Smith, 62, is Microsoft’s top lawyer, and he regularly represents the software company in policy discussions. He is among Microsoft top executives, leading over 1,500 people in legal and corporate affairs in 54 countries, according to a biography on Microsoft’s website.\n" +
                "\n" +
                "Microsoft recognized his work on sustainability, responsible artificial intelligence, external Covid-19 efforts and employee diversity in the 2020 fiscal year in its most recent proxy statement, which said he received \$16.7 million in total annual compensation. Smith owns about 732,000 shares of Microsoft stock, worth around \$217 million, according to FactSet.\n" +
                "\n" +
                "He joined Microsoft in 1993 from the law firm Covington & Burling to run Microsoft’s corporate and legal affairs in Europe, and he became Microsoft’s general counsel in 2002. Over the next decade he handled the resolution of antitrust cases, according to the biography.\n" +
                "\n" +
                "Smith became Microsoft’s president and joined Netflix’s board of directors in 2015. He is the author, with Carol Ann Browne, of “Tools and Weapons: The Promise and the Peril of the Digital Age,” a 2019 book that discusses privacy and security.\n" +
                "\n" +
                "Smith will continue to report to Nadella, Microsoft said.\n",
        "Microsoft has acquired TakeLessons, a start-up with a website where people book paid online and in-person classes on a variety of subjects, a Microsoft spokesperson confirmed Friday. Terms of the deal weren’t disclosed.\n" +
                "\n" +
                "The move shows Microsoft remains committed to providing opportunities for people to find educational content, and not just in the business realm. More than 6% of Microsoft’s revenue comes from LinkedIn, and the professional networking platform generates part of its revenue from premium subscriptions that include access to LinkedIn Learning, through which subscribers can complete online courses.\n" +
                "\n" +
                "LinkedIn is different from TakeLessons because it offers live training for private classes from instructors and live group classes. While LinkedIn Learning specializes in content on leadership, sales and other business subjects, TakeLessons has courses available on many consumer-oriented subjects, including music, languages and the arts.\n" +
                "\n" +
                "“TakeLessons is a unique, trusted online marketplace that connects diverse, qualified and vetted instructors with students of all ages pursuing their goals,” a Microsoft spokesperson told CNBC in an email. “This acquisition is in response to the growing demand on personalized hybrid opportunities and expands our product offerings to TakeLessons consumers, a leading online learning platform.”\n" +
                "\n" +
                "TakeLessons was founded in 2006 and is based in San Diego. Investors include Crosslink Capital, Moore Venture Partners, SoftTech VC and Triangle Peak Partners.\n" +
                "\n" +
                "“With the help and grit of the exceptional TakeLessons team, hundreds of millions of people from every corner of the world have visited TakeLessons, and taken many, many million minutes of lessons — learning everything from STEM to Farsi, guitar to horseback riding, parkour, tennis, singing, and yes, even beefing up on Excel macros,” TakeLessons founder and CEO Steven Cox wrote in a LinkedIn post.\n" +
                "\n" +
                "The coronavirus pandemic has benefited online learning. Covid “accelerated the market for online learning solutions,” Coursera said earlier this year as it filed to go public. And the number of hours people spent on LinkedIn Learning doubled year over year in the fourth quarter, Microsoft CEO Satya Nadella told analysts on a conference call in January.\n",
        "GUANGZHOU, China — For the foreseeable future, Chinese electric car start-up XPeng is trying to boost its sales in the world’s largest auto market.\n" +
                "\n" +
                "But the Guangzhou, China-based company is also exploring areas including robotics and flying cars, which could play a role in its longer-term goals.\n" +
                "\n" +
                "In an interview with CNBC that aired Thursday, He Xiaopeng, the founder and CEO of XPeng, discussed the ongoing chip shortage hitting the auto industry and why the Chinese Tesla rival is investing in robotics and flying modes of transport.\n" +
                "\n" +
                "Earlier this year, XPeng showed off a second prototype of a flying passenger car which it says has been in development for eight years. And on Tuesday, it took the wraps off a four-legged “robotic unicorn,” as it pushes into new areas of business.\n" +
                "\n" +
                "“With the development of technology, the form of mobility will evolve from wheels to wings, propellers, 4 legs or 2 feet,” He said, according to a CNBC translation of his Mandarin-language comments. “Technology should help people have better and happier lives. This has always been my goal.”\n" +
                "\n" +
                "The XPeng founder predicts that all automakers will become both car makers and robotics companies, a process He says could take 10 to 30 years. XPeng is looking at robots as a transportation tool “in a low-speed and random environment.”\n" +
                "\n" +
                "“As it gets better and smarter in the long run, it could help us with some simple repetitive tasks. As the transportation tool becomes more and more intelligent, it could help us take on some tasks. This is how we envision it,” he said.\n" +
                "\n" +
                "XPeng’s competitor Tesla is also investing in robotics. Last month, CEO Elon Musk said the company will build a humanoid robot called Tesla Bot. Other companies have also shown off robots, including Boston Dynamics and Chinese electronics giant Xiaomi.\n" +
                "\n" +
                "Flying cars\n" +
                "The X2, XPeng’s second flying car prototype and first that’s able to carry a passenger, was unveiled in July.\n" +
                "\n" +
                "Founder He said the company is building a research and development team that will “have a few hundred people.”\n" +
                "\n" +
                "“We want to introduce a flying car that can take off or land vertically, a low-to mid-altitude flying car.”\n" +
                "\n" +
                "A number of auto companies including Hyundai and China-based Geely are developing aerial vehicles. Other firms like Guangzhou-based EHang are also working on passenger drones.\n" +
                "\n" +
                "The XPeng founder said the company will have a press conference in the future, perhaps in a year, to discuss the dimensions and pricing as well as start taking pre-orders for its flying car.\n" +
                "\n" +
                "Chip shortage, new products\n" +
                "Like many automakers, XPeng has been affected by the global shortage of semiconductors that go into vehicles. The company said its deliveries of vehicles fell in August versus July. XPeng has three cars on the market — the flagship P7 sedan, a cheaper sedan called the P5 and the G3 sports utility vehicle.\n" +
                "\n" +
                "The supply chain poses the “biggest challenge” for the company, but He sees it as a chance to build resilience at the automaker.\n" +
                "\n" +
                "“The pandemic has caused a shortage of semiconductor chips, which is the biggest blow to our business. I expect the chip shortage to ease in about 18 months from now. In the near future, the situation might get even worse,” he said.\n" +
                "\n" +
                "“XPeng is a very young company. I see this as an early test. If we can overcome the challenge and get ready for what’s to come, we will do even better when our sales reach 300,000 or 500,000 cars per year.”\n" +
                "\n" +
                "Meanwhile, the company has pledged to push on with the release of new models. On Sept. 15, the company will officially launch its P5 sedan aimed at the mass market, after unveiling it in April. And from 2023, XPeng plans to launch at least two or three new vehicle models every year. In preparation for that, the electric carmaker is expanding its own manufacturing capacity.\n" +
                "\n" +
                "The CEO said that in the future the company will launch more cars in the range of 200,000 yuan (\$30,968) to 400,000 yuan. Currently, its cheapest car, the G3, starts at around 150,000 yuan. He also said that its models could include bigger 5-seat or 7-seat models. The company does not have a 7-seat model yet.\n" +
                "\n" +
                "XPeng has tried to pitch itself as different from its domestic rivals because it develops its own in-house semi-autonomous driving features in a system called XPilot. Its latest version, XPilot 3.0, can be added into its cars as an optional extra and is a rival to Tesla’s Autopilot.\n" +
                "\n" +
                "In the first quarter of the year, XPeng said that it recorded revenue from software for the first time, which includes its assisted driving system XPilot. The founder said that while the majority of XPeng’s revenue is from hardware now, software will be a “growing part” of that.\n" +
                "\n" +
                "“My idea is that after we launch XPilot 4.0, we will focus more on our software business,” He said, referring to the next-version of its limited self-driving feature suite.\n",
        "The price of bitcoin fell Tuesday after breaking through \$52,000 late Monday, reaching its highest level since May.\n" +
                "\n" +
                "The price action comes on the day El Salvador is set to adopt the largest cryptocurrency by market cap as legal tender, becoming the first country to do so. Bitcoin dropped as much as 16% on Tuesday morning. It was last down about 9.5% and trading at \$46,892.04, according to Coin Metrics. Ether fell 12% to \$3,441.21.\n" +
                "\n" +
                "Crypto adjacent stocks MicroStrategy and Coinbase also lost about 9% and 4%, respectively. Coinbase users were experiencing delayed or canceled transactions at “elevated rates” in the morning, the company said in an update on Twitter, but those issues were resolved by the afternoon. Major crypto exchanges Kraken and Gemini were also investigating delays and performance issues.\n" +
                "\n" +
                "Early Tuesday El Salvador temporarily disabled Chivo, its government-run bitcoin wallet, to increase the capacity of the servers, which were hindering new users from installing it, President Nayib Bukele announced in a tweet at about 7:00 a.m. EST.\n" +
                "\n" +
                "“Any data they try to enter at this time will give them an error,” he said. “This is a relatively straightforward problem, but it cannot be fixed with the system connected.”\n" +
                "\n" +
                "The market action is unsurprising, according to Leah Wald, CEO at Valkyrie Investments, who said the news was largely priced into the market “a while ago.”\n" +
                "\n" +
                "\n" +
                "“When this move was first announced, it didn’t have nearly as big of an impact on price as some may have expected it might, possibly because El Salvador’s population is less than New York City’s, but also because the announcement was light on details and people were on the fence about how this was going to be implemented,” she told CNBC, noting that much of El Salvador lives in poverty and doesn’t have the internet or smartphone access required to participate in the bitcoin network. “Transaction fees, processing times, and other hurdles also make this feel more like a beta test rather than a solution to many of the problems plaguing the country’s poor,” Wald added.\n" +
                "\n" +
                "As part of the new law, businesses will be required to accept bitcoin for goods and services, though merchants who aren’t technologically able to accept bitcoin will be exempt. The government has installed 200 bitcoin ATMs around El Salvador. It also bought 400 bitcoins worth about \$20 million and is preloading Chivo wallets with \$30 worth of bitcoin for Salvadorans who register.\n" +
                "\n" +
                "Some traders are saying on social media that they will be buying \$30 worth of bitcoin in their local fiat currencies to commemorate and support El Salvador’s new law, at 3:00 p.m. ET. But bitcoin prices were sliding into the afternoon anyway.\n" +
                "\n" +
                "“What is most worth looking out for is whether or not neighboring countries in Latin America, or those elsewhere around the world, begin to adopt bitcoin as their national currency as well,” Wald said. “Should this occur, that is when we could see a parabolic move higher, as the momentum gained from many millions more people having instant access to crypto should result in more adoption, more HODLing, and higher prices.” HODLing is crypto community slang for the buy-and-hold investment strategy.\n" +
                "\n" +
                "Bitcoin advocates have long held there’s a strong case for Latin American markets using the cryptocurrency as a medium of exchange, for remittances and even for central banks that experience high currency depreciation.\n" +
                "\n" +
                "On Monday Panamanian politician Gabriel Silva introduced the “Crypto Law,” which “seeks to make Panama a country compatible with the blockchain, crypto assets and the internet,” he said on Twitter. “This has the potential to create thousands of jobs, attract investment and make the government transparent,” he added.\n",
        "GUANGZHOU, China — BYD sold 61,409 new energy vehicles in August, more than four times the amount sold a year ago, as demand for electric cars continues to rise in the world’s largest auto market.\n" +
                "\n" +
                "That figure was nearly evenly split between sales of battery electric vehicles and so-called plug-in hybrids.\n" +
                "\n" +
                "It was also a rise from the 50,492 cars sold in July. BYD shares rose 5.5% in morning trade in Hong Kong.\n" +
                "\n" +
                "BYD, which is backed by Warren Buffett’s Berkshire Hathaway, is one of the biggest electric vehicle makers in China. But a number of start-ups including Nio, Li Auto and XPeng have looked to challenge it. Still, these three are smaller at the moment and all delivered under 10,000 cars in August.\n" +
                "\n" +
                "BYD’s figures focus on sales volumes while Nio, Li Auto and XPeng released delivery numbers, so the comparison is not like-for-like, but it does indicate the scale of the respective companies.\n" +
                "\n" +
                "\n" +
                "The auto industry globally has been battling with two major issues — the continuing pandemic and a shortage of semiconductors that go into cars.\n" +
                "\n" +
                "BYD did not provide any commentary around the August numbers. But in its half year results released last month, the company said “profitability is affected to some extent by factors including rising prices of raw materials such as bulk commodities.”\n" +
                "\n" +
                "Despite the issues affecting the auto industry, demand for electric vehicles continues to climb in China, as the government pushes development of the sector.\n" +
                "\n" +
                "China is expected to sell 1.7 million new energy vehicles in the first eight months of this year, a rise from 600,000 cars in the same period of 2020, according to a Reuters report of comments from the vice minster of China’s Ministry of Industry and Information Technology made on Saturday.\n",
        "Tesla CEO Elon Musk said Wednesday that supply chain shortages continue to stress the automaker, and the company is delaying deliveries of the new version of the Roadster until 2023 at the earliest.\n" +
                "\n" +
                "Specifically, he tweeted: “2021 has been the year of super crazy supply chain shortages, so it wouldn’t matter if we had 17 new products, as none would ship. Assuming 2022 is not mega drama, new Roadster should ship in 2023.”\n" +
                "\n" +
                "Tesla is not alone among automakers grappling with supply chain pressure. Other automakers, including Toyota and Ford, have slashed production volumes to cope with chip shortages.\n" +
                "\n" +
                "The new version of Tesla’s high-performance electric car was supposed to debut in 2020. Tesla first revealed plans for the next-generation Roadster in late 2017 during an event to unveil a heavy-duty truck, the Tesla Semi, which the company also has yet to mass-produce.\n" +
                "\n" +
                "At that time, the company said the next-generation Roadster would boast a top speed of at least 250 miles an hour, a 200 kilowatt-hour battery pack that would deliver more than 620 miles of range on a full charge and three electric motors enabling the Roadster to go from 0 to 60 miles per hour in under 2 seconds (and a quarter-mile in under 9 seconds).\n" +
                "\n" +
                "Musk later promised the next-gen Roadster would be sold with a premium “SpaceX option” including rocket thrusters that would allow the car to hover far above the ground. He described it as a “full-on James Bond” vehicle in an episode of “Jay Leno’s Garage.”\n" +
                "\n" +
                "According to Tesla’s website, Roadster reservations require an initial \$5,000 credit card payment with a \$45,000 wire transfer payment due in 10 days. The reservation money is refundable up until the customer signs a purchase agreement. Tesla says it will send to these purchase agreements near the date of production.\n" +
                "\n" +
                "parts shortages on earnings calls in recent quarters, emphasizing chip shortages.\n" +
                "\n" +
                "On the second-quarter shareholder call, Musk said Tesla went through a “big struggle” to get enough modules that control the airbags and seatbelts in the company’s cars. A lack of those modules limited the company’s production in Fremont, California, and Shanghai.\n" +
                "\n" +
                "Musk said May 31 that Tesla had raised the prices for some of its vehicles, and removed some parts from them, due to the rising cost of parts and raw materials amid recent supply chain pressures.\n",
        "Last year, 42% of new electricity generation capacity in the U.S. came from land-based wind energy -- more than from any other source -- according to numbers in a series of reports from the Department of Energy (DOE) this week. By contrast, solar amounted to only 38% of new capacity last year.\n" +
                "\n" +
                "This measures capacity, which is the maximum amount of electricity that can be produced under ideal conditions, while actual energy generation can be much less than that ideal amount as wind varies.\n" +
                "\n" +
                "While both capacity and electricity generation from wind can vary regionally, land-based wind is now a strong, intermittent energy source across the U.S. According to research by DOE’s Lawrence Berkeley National Laboratory, a record 16,836 megawatts of new utility-scale land-based wind power capacity was added to U.S. energy infrastructure in 2020, representing about \$24.6 billion of investment in new wind power.\n" +
                "\n" +
                "Last year, the DOE noted, wind energy was able to provide more than half of in-state electricity generation and sales in a few states. Iowa led the pack with wind power providing 57% of its in-state electricity generation. However, Iowa has a lot of wind turbines, and not a very big population.\n" +
                "\n" +
                "More typically, wind is used to generate electricity for the electric power industry during fall and spring nights, and the winter season. (Along the Gulf Coast in Texas, wind energy shows up in the late afternoon or early evenings during the summer.)\n" +
                "\n" +
                "The growth of land-based wind energy in the U.S. last year was driven partly by production tax credits that are poised for a phaseout, encouraging development before that event horizon.\n" +
                "\n" +
                "Wind technology improvements also helped encourage land-based wind development. Compared to older wind turbines, the latest models feature taller towers with longer blades that can produce more energy by reaching into higher winds.\n" +
                "\n" +
                "In addition to land-based wind farms, myriad off-shore wind developments are underway domestically. But last year, off-shore wind farms still weren’t operational across most of the U.S.\n" +
                "\n" +
                "The DOE’s 2021 Offshore Wind Market Report instead focuses on the “pipeline” of offshore initiatives. In 2020, the offshore pipeline “grew to a potential generating capacity of 35,324 megawatts (MW),” a 24% increase from the prior year, that report says.\n" +
                "\n" +
                "The Block Island Wind Farm off of Rhode Island, and the Coastal Virginia Offshore Wind pilot project (off the coast of Virginia Beach) are the first two off shore wind farms to become operational in the U.S. One other project, Vineyard Wind 1, south of Nantucket, Mass. has received all permits and locked in contracts to sell their power and deliver it to the grid.\n" +
                "\n" +
                "There are 15 other offshore wind projects in the pipeline that have reached the permitting phase, and seven wind energy areas that can be leased at the discretion of the federal government in the future, the DOE report said.\n" +
                "\n" +
                "The Biden administration wants to expand U.S. offshore wind capacity to 30 gigawatts by 2030 as part of its goal to achieve a carbon pollution-free power sector by 2035.\n" +
                "\n" +
                "Other forms of clean energy will be needed, alongside all forms of wind power, to fulfill electricity demand in the U.S. while decreasing greenhouse gas emissions.\n"
    )

    val listNews: ArrayList<News>
        get() {
            val list = arrayListOf<News>()

            for (pos in newsTitle.indices) {
                val news = News(newsPicture[pos], newsTitle[pos], newsDateAuthor[pos], newsDescription[pos], newsIsFavorite[pos])
                list.add(news)
            }
            return list
        }
}

fun main() {

}