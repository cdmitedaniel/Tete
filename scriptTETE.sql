USE [Tete]
GO
/****** Object:  Table [dbo].[Tbl_Localidad]    Script Date: 07-Jan-20 1:27:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Tbl_Localidad](
	[Nombre] [nvarchar](50) NULL,
	[Detalles] [nvarchar](50) NOT NULL,
	[Url_Img] [nvarchar](250) NOT NULL,
	[Referencia] [nvarchar](500) NOT NULL,
	[Id_Localidad] [int] IDENTITY(1,1) NOT NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Tbl_Ubicacion]    Script Date: 07-Jan-20 1:27:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Tbl_Ubicacion](
	[Nombre] [nvarchar](50) NULL,
	[Id_Ubicacion] [int] IDENTITY(1,1) NOT NULL,
	[Lat] [nvarchar](max) NULL,
	[Long] [nvarchar](max) NULL,
	[Lat1] [float] NULL,
	[Long1] [float] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Tbl_Users]    Script Date: 07-Jan-20 1:27:51 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Tbl_Users](
	[Nom_User] [nvarchar](50) NULL,
	[Pass] [nvarchar](50) NULL,
	[mail] [nvarchar](50) NULL,
	[Nombre] [nvarchar](50) NULL,
	[Id_User] [int] IDENTITY(1,1) NOT NULL
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[Tbl_Ubicacion] ON 

INSERT [dbo].[Tbl_Ubicacion] ([Nombre], [Id_Ubicacion], [Lat], [Long], [Lat1], [Long1]) VALUES (N'Maternidad Cisnes 02 ', 1, N'-2.1871012', N'-79.9828333', -21871012, -799828333)
INSERT [dbo].[Tbl_Ubicacion] ([Nombre], [Id_Ubicacion], [Lat], [Long], [Lat1], [Long1]) VALUES (N'Clinica Ortiz Maternidad', 2, N'-2.1870979', N'-79.9831768', -21870979, -799831768)
INSERT [dbo].[Tbl_Ubicacion] ([Nombre], [Id_Ubicacion], [Lat], [Long], [Lat1], [Long1]) VALUES (N'Hospital de la Mujer Alfredo G. Paulson', 3, N'-2.1870946', N'-79.9835203', -21870946, -799835203)
INSERT [dbo].[Tbl_Ubicacion] ([Nombre], [Id_Ubicacion], [Lat], [Long], [Lat1], [Long1]) VALUES (N'Maternidad del Guasmo Matilde Hidago De Procel', 4, N'-2.2758325', N'-79.8774671', -22758325, -798774671)
INSERT [dbo].[Tbl_Ubicacion] ([Nombre], [Id_Ubicacion], [Lat], [Long], [Lat1], [Long1]) VALUES (N'Antigua maternidad', 5, N'-2.1793541', N'-80.0099583', -21793541, -800099583)
INSERT [dbo].[Tbl_Ubicacion] ([Nombre], [Id_Ubicacion], [Lat], [Long], [Lat1], [Long1]) VALUES (N'Maternidad certificados', 6, N'-2.1870881', N'-79.9842073', -21870881, -799842073)
INSERT [dbo].[Tbl_Ubicacion] ([Nombre], [Id_Ubicacion], [Lat], [Long], [Lat1], [Long1]) VALUES (N'Clinica Antonio Gil - Maternidad', 7, N'-2.1870848', N'-79.9845509', -21870848, -799845509)
INSERT [dbo].[Tbl_Ubicacion] ([Nombre], [Id_Ubicacion], [Lat], [Long], [Lat1], [Long1]) VALUES (N'MATERNIDAD  Virgen de Fátima', 11, N'-2.187075', N'-79.9855814', -2187075, -799855814)
SET IDENTITY_INSERT [dbo].[Tbl_Ubicacion] OFF
SET IDENTITY_INSERT [dbo].[Tbl_Users] ON 

INSERT [dbo].[Tbl_Users] ([Nom_User], [Pass], [mail], [Nombre], [Id_User]) VALUES (N'Tete', N'Tete', NULL, NULL, 1)
INSERT [dbo].[Tbl_Users] ([Nom_User], [Pass], [mail], [Nombre], [Id_User]) VALUES (N'Arce', N'12345', N'm.arce@eikon.com.ec', N'Mario', 2)
INSERT [dbo].[Tbl_Users] ([Nom_User], [Pass], [mail], [Nombre], [Id_User]) VALUES (N'dsgonzag', N'123456', N'dsgonzag@espol.edu.ec', N'Diana', 3)
SET IDENTITY_INSERT [dbo].[Tbl_Users] OFF
